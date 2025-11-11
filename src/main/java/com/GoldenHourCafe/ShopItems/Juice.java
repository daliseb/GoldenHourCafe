package com.GoldenHourCafe.ShopItems;

public class Juice {
    private Boolean wantDrink;  //drink is Not required, ask the user if wanted.
    private String type;   //what drink?
    private double price;
 //constructor


    public Juice(Boolean wantDrink, String type, double price) {
        this.wantDrink = wantDrink;
        this.type = type;
        this.price = price;
    }

    public Boolean getWantDrink() {
        return wantDrink;
    }

    public void setWantDrink(Boolean wantDrink) {
        this.wantDrink = wantDrink;
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
        return wantDrink + " " + type + price;
    }
}
