package com.GoldenHourCafe;

public class Juice {
    private Boolean wantDrink;  //drink is Not required, ask the user if wanted.
    private String type;   //what drink?
    private String price;
 //constructor
    public Juice(Boolean wantDrink, String type, String price) {
        this.wantDrink = wantDrink;
        this.type = type;
        this.price = price;
    }

    //get and set

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return wantDrink + " " + type + price;
    }
}
