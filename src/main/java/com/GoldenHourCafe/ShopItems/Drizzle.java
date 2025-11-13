package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;

public class Drizzle {
    private Boolean wantDrizzle; //option for drizzle
    private int type;  //what kind

    //price was deleted because the drizzle IS included in the order and acquires no additional cost.

    public Drizzle(Boolean wantDrizzle, int type) {
        this.wantDrizzle = wantDrizzle;
        this.type = type;
    }

    public Boolean getWantDrizzle() {
        return wantDrizzle;
    }

    public void setWantDrizzle(Boolean wantDrizzle) {
        this.wantDrizzle = wantDrizzle;
    }

        public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public static Drizzle optionForDrizzle(){
        System.out.println("""
          ----Select Your Drizzle!----
          1.Peanut Butter
          2.Almond Butter
          3.Honey
          4.Organic Greek Yogurt
          5.Agave
          6.None
          """);

        boolean wantDrizzle = ConsoleHelper.promptForBoolean("Would You Like Drizzle? (y/n)");
    //following if statement, is made in case user wants no drizzle
        if (!wantDrizzle){
            System.out.println("No Drizzle Added");
            return new Drizzle(false, 6);

        }
        int choice;
        while(true) {
            choice

        }

    }




    @Override
    public String toString() {
        return wantDrizzle + " " + type;

    }

}
