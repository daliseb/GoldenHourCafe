package com.GoldenHourCafe.ShopItems;

public class Drizzle {
    private Boolean wantDrizzle; //option for drizzle
    private String type;  //what kind
    private double price;


    public Drizzle(Boolean wantDrizzle, String type, double price) {
        this.wantDrizzle = wantDrizzle;
        this.type = type;
        this.price = price;
    }

    public Boolean getWantDrizzle() {
        return wantDrizzle;
    }

    public void setWantDrizzle(Boolean wantDrizzle) {
        this.wantDrizzle = wantDrizzle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return wantDrizzle + " " + type + price;

    }

}
