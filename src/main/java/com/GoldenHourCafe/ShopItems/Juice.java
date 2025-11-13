package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;

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
//prompt the user to select juice if wanted
    public static Juice optionForJuice() {
        System.out.println("""
                --- Cold Pressed Juice:
                1.Green Juice
                  (Spinach,Kale,Cucumber, Apple)
                
                2.Sunrise Juice
                  (Strawberry, Watermelon, Lime)
                
                3.Berry babe
                  (Blueberry,Raspberry, Apple, Lemon,Chia Seed)
                
                4.Strawberry Dream
                  (Strawberries, Orange Juice, Coconut water, Dates)
                
                """);

        boolean wantDrink = ConsoleHelper.promptForBoolean("Would you like to add a drink? (y/n");
        if (!wantDrink) {
            System.out.println("No Drink Added");
            return new Juice(false, "none",0.00 );
        }
    }



    @Override
    public String toString() {
        return wantDrink + " " + type + price;
    }
}
