package com.GoldenHourCafe;

import javax.swing.*;

public class SmoothieBase {
    private String size;   //small medium large
    private String baseType;  //what kind??
    private double price;   //base price


    //constructors
    public SmoothieBase(String size, String baseType, double price) {
        this.size = size;
        this.baseType = baseType;
        this.price = price;
    }

    //getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return size + " " + baseType + " " + price;
    }
}
