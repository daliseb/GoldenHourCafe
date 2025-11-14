package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;
import com.GoldenHourCafe.UserInterface.OrderItem;

public class Side extends OrderItem {
    private Boolean wantSide; //a question, sides are NOT required.
    private String type;
    private double price;

    //constructors

    public Side(Boolean wantSide, String type, double price) {
        this.wantSide = wantSide;
        this.type = type;
        this.price = price;
    }

    //empty constructor
    public Side(){

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

//    public double getPrice() {
//        return price;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    //prompt the user, using the same structure from my other classes:
    public static Side optionForSide() {

        boolean wantSide = ConsoleHelper.promptForBoolean("Add A Side? (y/n)");
        System.out.println("""
                -----⟡ Choose A Side ⟡-----
                      (3.00 Each)
                1. Banana Oat Muffin
                2. Chocolate Protein Bites""");


        if (!wantSide) {
            System.out.println("No Side Added");
            return new Side(false, "None", 0.00);
        }

        int choice;
        while (true) {
            choice = ConsoleHelper.promptForInt("Select Your Side (1-2)");
            if (choice >= 1 && choice <= 2) break;
            System.out.println("Invalid Choice, Select (1-2)");
        }

        //this is setting the starting price, all sides are same price and start at $3
        String type = getSideName(choice);
        double price = 3.00;
        System.out.println("Side Has Been Added To Cart:" + " " + type + "   $" + price);
        return new Side(true, type, price);
    }
    private static String getSideName(int choice){
        return switch (choice){
            case 1 -> "Banana Oat Muffin";
            case 2 -> "Chocolate Protein Bites";
            default -> "None";
        };
    }

        @Override
    public double getPrice(){
        return price;
        }

        @Override
    public String toString() {
        return type + " $" + price;
    }
}



