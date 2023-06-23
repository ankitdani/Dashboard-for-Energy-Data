package com.example.application;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Route("")
public class MainView extends VerticalLayout {
    private Grid<DataItem> grid;

    public MainView() {
        // Initialize the Vaadin components
        grid = new Grid<>(DataItem.class);
        add(grid);

        // Invoke the Python script
        invokePythonScript();

        // Read data from the database and populate the grid
        loadDataFromDatabase();
    }

    private void invokePythonScript() {
        try {
            String command = "python3 main.py";
            Process process = Runtime.getRuntime().exec(command);
            InputStream stdout = process.getErrorStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
            String line;
            try{
                System.out.println("Reading");
                while((line = reader.readLine()) != null){
                    System.out.println("stdout: "+ line);
                }
            }catch(IOException e){
                System.out.println("Exception in reading output"+ e.toString());
            }
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Python script executed successfully.");
            } else {
                System.out.println("Error executing the Python script.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loadDataFromDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/energy_consumption";
            String username = "root";
            String password = "root1234";

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM energy_data";
            ResultSet resultSet = statement.executeQuery(query);

            // Populate the grid with the retrieved data
            List<DataItem> dataItems = new ArrayList<>();

            while (resultSet.next()) {
                String iso_code = resultSet.getString("iso_code");
                String country = resultSet.getString("country");
                int year = resultSet.getInt("year");
                Float coal_prod_change_pct = resultSet.getFloat("coal_prod_change_pct");
                Float coal_prod_change_twh = resultSet.getFloat("coal_prod_change_twh");
                Float gas_prod_change_pct = resultSet.getFloat("gas_prod_change_pct");
                Float gas_prod_change_twh = resultSet.getFloat("gas_prod_change_twh");
                Float oil_prod_change_pct = resultSet.getFloat("oil_prod_change_pct");
                Float oil_prod_change_twh = resultSet.getFloat("oil_prod_change_twh");
                Float energy_cons_change_pct = resultSet.getFloat("energy_cons_change_pct");
                Float energy_cons_change_twh = resultSet.getFloat("energy_cons_change_twh");
                Float biofuel_share_elec = resultSet.getFloat("biofuel_share_elec");
                Float biofuel_elec_per_capita = resultSet.getFloat("biofuel_elec_per_capita");
                Float biofuel_cons_change_pct = resultSet.getFloat("biofuel_cons_change_pct");
                Float biofuel_share_energy = resultSet.getFloat("biofuel_share_energy");
                Float biofuel_cons_change_twh = resultSet.getFloat("biofuel_cons_change_twh");
                Float biofuel_consumption = resultSet.getFloat("biofuel_consumption");
                Float biofuel_cons_per_capita = resultSet.getFloat("biofuel_cons_per_capita");
                Float carbon_intensity_elec = resultSet.getFloat("carbon_intensity_elec");
                Float coal_share_elec = resultSet.getFloat("coal_share_elec");

                DataItem dataItem = new DataItem(iso_code, country, year, coal_prod_change_pct, coal_prod_change_twh, gas_prod_change_pct, gas_prod_change_twh, oil_prod_change_pct, oil_prod_change_twh, energy_cons_change_pct, energy_cons_change_twh, biofuel_share_elec, biofuel_elec_per_capita, biofuel_cons_change_pct, biofuel_share_energy, biofuel_cons_change_twh, biofuel_consumption, biofuel_cons_per_capita, carbon_intensity_elec, coal_share_elec);
                dataItems.add(dataItem);
            }
            grid.setItems(dataItems);
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}