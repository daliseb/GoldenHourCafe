package com.GoldenHourCafe.ShopItems;

import java.util.ArrayList;
import java.util.List;

public class Drizzle {
    private Boolean wantDrizzle; //option for drizzle
    private String type;  //what kind

    //price was deleted because the drizzle IS included in the order and acquires no additional cost.

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


    public static Drizzle optionForDrizzle(){
        System.out.println(""""
          ----Select Your Drizzle!----
          1.
          2.
          3.
          4.
          ");




    }














    @Override
    public String toString() {
        return wantDrizzle + " " + type;

    }

}
