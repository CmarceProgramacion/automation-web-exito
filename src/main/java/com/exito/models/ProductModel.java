package com.exito.models;

public class ProductModel {

    private String idProduct;
    private String name;
    private int unitValue;
    private int unitAmount;

    public ProductModel() {
    }

    public ProductModel(String idProduct, String name, int unitValue, int unitAmount) {
        this.idProduct = idProduct;
        this.name = name;
        this.unitValue = unitValue;
        this.unitAmount = unitAmount;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(int unitValue) {
        this.unitValue = unitValue;
    }

    public int getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(int unitAmount) {
        this.unitAmount = unitAmount;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", unitValue=" + unitValue +
                ", unitAmount=" + unitAmount +
                '}';
    }
}
