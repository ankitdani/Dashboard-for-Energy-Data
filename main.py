import csv
import mysql.connector

# Database connection details
host = 'localhost'
username = 'root'
password = 'root1234'
database = 'energy_consumption'

# Table name
table_name = 'energy_data'

# CSV file path
csv_file_path = '/Users/ankit_dani/Downloads/codingassessment 2/World Energy Consumption - Sheet1.csv'

# Connect to the database
conn = mysql.connector.connect(
    host=host,
    user=username,
    password=password,
    database=database
)

# Create a cursor to perform database operations
cursor = conn.cursor()

# Read data from the CSV file and insert into the database
with open(csv_file_path, 'r', newline='') as csv_file:
    csv_reader = csv.reader(csv_file)
    header = next(csv_reader)  # Skip the header ro
    for row in csv_reader:
        iso_code = row[0]  # Get the value of the iso_code column
        country = row[1]  # Get the value of the country column
        query = "INSERT INTO energy_data " \
                "(iso_code, country, year, coal_prod_change_pct, coal_prod_change_twh, gas_prod_change_pct, " \
                "gas_prod_change_twh, oil_prod_change_pct, oil_prod_change_twh, energy_cons_change_pct, " \
                "energy_cons_change_twh, biofuel_share_elec, biofuel_elec_per_capita, biofuel_cons_change_pct, " \
                "biofuel_share_energy, biofuel_cons_change_twh, biofuel_consumption, biofuel_cons_per_capita, " \
                "carbon_intensity_elec, coal_share_elec) " \
                "VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, " \
                "%s, %s, %s, %s, %s, %s, %s, %s, %s)"
        # Process the row and handle empty or non-numeric values
        processed_row = []
        for value in row:
            if not value:  # Empty value
                processed_row.append(None)
            else:
                processed_row.append(value)
        cursor.execute(query, tuple(processed_row))

# Commit the changes and close the database connection
conn.commit()
cursor.close()
conn.close()

print("Data has been imported successfully.")