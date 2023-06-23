package com.example.application;

public class DataItem {
    private String isoCode;
    private String country;
    private int year;
    private float coalProdChangePct;
    private float coalProdChangeTwh;
    private float gasProdChangePct;
    private float gasProdChangeTwh;
    private float oilProdChangePct;
    private float oilProdChangeTwh;
    private float energyConsChangePct;
    private float energyConsChangeTwh;
    private float biofuelShareElec;
    private float biofuelElecPerCapita;
    private float biofuelConsChangePct;
    private float biofuelShareEnergy;
    private float biofuelConsChangeTwh;
    private float biofuelConsumption;
    private float biofuelConsPerCapita;
    private float carbonIntensityElec;
    private float coalShareElec;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCoalProdChangePct() {
        return coalProdChangePct;
    }

    public void setCoalProdChangePct(float coalProdChangePct) {
        this.coalProdChangePct = coalProdChangePct;
    }

    public float getCoalProdChangeTwh() {
        return coalProdChangeTwh;
    }

    public void setCoalProdChangeTwh(float coalProdChangeTwh) {
        this.coalProdChangeTwh = coalProdChangeTwh;
    }

    public float getGasProdChangePct() {
        return gasProdChangePct;
    }

    public void setGasProdChangePct(float gasProdChangePct) {
        this.gasProdChangePct = gasProdChangePct;
    }

    public float getGasProdChangeTwh() {
        return gasProdChangeTwh;
    }

    public void setGasProdChangeTwh(float gasProdChangeTwh) {
        this.gasProdChangeTwh = gasProdChangeTwh;
    }

    public float getOilProdChangePct() {
        return oilProdChangePct;
    }

    public void setOilProdChangePct(float oilProdChangePct) {
        this.oilProdChangePct = oilProdChangePct;
    }

    public float getOilProdChangeTwh() {
        return oilProdChangeTwh;
    }

    public void setOilProdChangeTwh(float oilProdChangeTwh) {
        this.oilProdChangeTwh = oilProdChangeTwh;
    }

    public float getEnergyConsChangePct() {
        return energyConsChangePct;
    }

    public void setEnergyConsChangePct(float energyConsChangePct) {
        this.energyConsChangePct = energyConsChangePct;
    }

    public float getEnergyConsChangeTwh() {
        return energyConsChangeTwh;
    }

    public void setEnergyConsChangeTwh(float energyConsChangeTwh) {
        this.energyConsChangeTwh = energyConsChangeTwh;
    }

    public float getBiofuelShareElec() {
        return biofuelShareElec;
    }

    public void setBiofuelShareElec(float biofuelShareElec) {
        this.biofuelShareElec = biofuelShareElec;
    }

    public float getBiofuelElecPerCapita() {
        return biofuelElecPerCapita;
    }

    public void setBiofuelElecPerCapita(float biofuelElecPerCapita) {
        this.biofuelElecPerCapita = biofuelElecPerCapita;
    }

    public float getBiofuelConsChangePct() {
        return biofuelConsChangePct;
    }

    public void setBiofuelConsChangePct(float biofuelConsChangePct) {
        this.biofuelConsChangePct = biofuelConsChangePct;
    }

    public float getBiofuelShareEnergy() {
        return biofuelShareEnergy;
    }

    public void setBiofuelShareEnergy(float biofuelShareEnergy) {
        this.biofuelShareEnergy = biofuelShareEnergy;
    }

    public float getBiofuelConsChangeTwh() {
        return biofuelConsChangeTwh;
    }

    public void setBiofuelConsChangeTwh(float biofuelConsChangeTwh) {
        this.biofuelConsChangeTwh = biofuelConsChangeTwh;
    }

    public float getBiofuelConsumption() {
        return biofuelConsumption;
    }

    public void setBiofuelConsumption(float biofuelConsumption) {
        this.biofuelConsumption = biofuelConsumption;
    }

    public float getBiofuelConsPerCapita() {
        return biofuelConsPerCapita;
    }

    public void setBiofuelConsPerCapita(float biofuelConsPerCapita) {
        this.biofuelConsPerCapita = biofuelConsPerCapita;
    }

    public float getCarbonIntensityElec() {
        return carbonIntensityElec;
    }

    public void setCarbonIntensityElec(float carbonIntensityElec) {
        this.carbonIntensityElec = carbonIntensityElec;
    }

    public float getCoalShareElec() {
        return coalShareElec;
    }

    public void setCoalShareElec(float coalShareElec) {
        this.coalShareElec = coalShareElec;
    }

    public DataItem(String isoCode, String country, int year, float coalProdChangePct, float coalProdChangeTwh, float gasProdChangePct, float gasProdChangeTwh, float oilProdChangePct, float oilProdChangeTwh, float energyConsChangePct, float energyConsChangeTwh, float biofuelShareElec, float biofuelElecPerCapita, float biofuelConsChangePct, float biofuelShareEnergy, float biofuelConsChangeTwh, float biofuelConsumption, float biofuelConsPerCapita, float carbonIntensityElec, float coalShareElec) {
        this.isoCode = isoCode;
        this.country = country;
        this.year = year;
        this.coalProdChangePct = coalProdChangePct;
        this.coalProdChangeTwh = coalProdChangeTwh;
        this.gasProdChangePct = gasProdChangePct;
        this.gasProdChangeTwh = gasProdChangeTwh;
        this.oilProdChangePct = oilProdChangePct;
        this.oilProdChangeTwh = oilProdChangeTwh;
        this.energyConsChangePct = energyConsChangePct;
        this.energyConsChangeTwh = energyConsChangeTwh;
        this.biofuelShareElec = biofuelShareElec;
        this.biofuelElecPerCapita = biofuelElecPerCapita;
        this.biofuelConsChangePct = biofuelConsChangePct;
        this.biofuelShareEnergy = biofuelShareEnergy;
        this.biofuelConsChangeTwh = biofuelConsChangeTwh;
        this.biofuelConsumption = biofuelConsumption;
        this.biofuelConsPerCapita = biofuelConsPerCapita;
        this.carbonIntensityElec = carbonIntensityElec;
        this.coalShareElec = coalShareElec;
    }
}
