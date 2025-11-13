package com.GoldenHourCafe.ShopItems;

public class Drizzle {
    private Boolean wantDrizzle; //option for drizzle
    private String type;  //what kind

    //price was deleted because the drizzle IS included in the order and acquires not additional cost.

    public Drizzle(Boolean wantDrizzle, String type) {
        this.wantDrizzle = wantDrizzle;
        this.type = type;
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


    @Override
    public String toString() {
        return wantDrizzle + " " + type;

    }

}
