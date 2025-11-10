package com.GoldenHourCafe;

public class Side {
    private Boolean wantSide; //a question, sides are NOT required.
    private String type;
    private String price;

    public Side(Boolean wantSide, String type, String price) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return wantSide + " " + type + " " + price;
    }
}
