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
    public static Juice optionForJuice (int size) {
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
        //first we need to ask the user whether they want a drink:
        boolean wantDrink = ConsoleHelper.promptForBoolean("Would you like to add a drink? (y/n)");
        if (!wantDrink) {
            System.out.println("No Drink Added");
            return new Juice(false, "none", 0.00);
        }

        int choice;
        while (true) {
            choice = ConsoleHelper.promptForInt("Select Your Drink (1-4)");
            if (choice >= 1 && choice <= 4) break;
            System.out.println("Invalid Choice! Please Select (1-4)");
        }
    //so I can call it in my order class
        String type = getJuiceName(choice);
        double price = getJuicePrice(size);

        System.out.println("Juice Has Been Added To Cart!" + " " + type + " " + price );
        return new Juice(true, type, price );
    }
    //switch case for juice menu choices
    private static String getJuiceName(int choice) {
        return switch (choice) {
            case 1 -> "Green Juice";
            case 2 -> "Sunrise Juice";
            case 3 -> "Berry Babe";
            case 4 -> "Strawberry Dream";
            default -> "None";

        };
    }
    private static double getJuicePrice(int size){
        return switch (size){
            case 1 -> 6.00; //small
            case 2 -> 8.00; //medium
            case 3 -> 10.00; //large
            default -> 6.00; //default for small
        };

    }

    @Override
    public String toString() {
        return wantDrink + " " + type + price;
    }
    }

