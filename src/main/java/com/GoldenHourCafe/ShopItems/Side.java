package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;

import javax.print.attribute.standard.Sides;

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

    //prompt the user, using the same structure from my other classes:
    public static Side optionForSide() {
        System.out.println("""
                -----Choose A Side-----
                      (3.00 Each)
                1. Banana Oat Muffin
                2. Chocolate Protein Bites""");


        boolean wantSide = ConsoleHelper.promptForBoolean("Add A Side? (y/n)");
        if (!wantSide) {
            System.out.println("No Side Added");
            return new Side(false, "None", 0.00);
        }

        int choice;
        while(true){
            choice = ConsoleHelper.promptForInt("Select Your Side (1-2)");
            if (choice >= 1 && choice <= 2) break;
            System.out.println("Invalid Choice, Select (1-2)");
        }


    }
//    @Override
//    public String toString() {
//        return wantSide + " " + type + " " + price;
//    }
}

