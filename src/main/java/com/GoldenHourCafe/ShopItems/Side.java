package com.GoldenHourCafe.ShopItems;

public class Side {
    private Boolean wantSide; //a question, sides are NOT required.
    private String type;
    private double price;

    //constructors

    public Side(Boolean wantSide, String type, double price) {
        this.wantSide = wantSide;
        this.type = type;
        this.price = price;
    }

    public Boolean getWantSide() {
        return wantSide;
    }

    public void setWantSide(Boolean wantSide) {
        this.wantSide = wantSide;
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
        return wantSide + " " + type + " " + price;
    }
}
