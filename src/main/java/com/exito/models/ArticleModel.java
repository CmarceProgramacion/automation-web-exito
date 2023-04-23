package com.exito.models;

public class ArticleModel {
    private String name;
    private int unitValue;
    private int unitAmount;

    public ArticleModel() {
    }

    public ArticleModel(String name, int unitValue, int amount) {
        this.name = name;
        this.unitValue = unitValue;
        this.unitAmount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitValue(int unitValue) {
        this.unitValue = unitValue;
    }

    public void setUnitAmount(int unitAmount) {
        this.unitAmount = unitAmount;
    }

    public String getName() {
        return name;
    }

    public int getUnitValue() {
        return unitValue;
    }

    public int getUnitAmount() {
        return unitAmount;
    }

    @Override
    public String toString() {
        return "ArticleModel{" +
                "name='" + name + '\'' +
                ", unitValue=" + unitValue +
                ", unitAmount=" + unitAmount +
                '}';
    }
}
