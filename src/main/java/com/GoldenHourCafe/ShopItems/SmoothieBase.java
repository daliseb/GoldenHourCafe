package com.GoldenHourCafe.ShopItems;
import com.GoldenHourCafe.UserInterface.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;

public class SmoothieBase {
    private String size;   //small medium large
    private String baseType;  //what kind??
    private double price;   //base price

    //constructors
    public SmoothieBase(String size, String baseType, double price) {
        this.size = size;
        this.baseType = baseType;
        this.price = price;
    }

    //getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //method to set the flavors of smoothie bases
    public static SmoothieBase baseOption() {
        //lines 53 and 54 were from last capstone
        System.out.println("""
                ( --Choose Your Base:");
                  1.Acai berry" + "(Mixed berry blend, acai, oat milk)
                  2.Green Blend" + "(pineapple, spinach, kale, coconut water)
                  3.Peachy Beem" + "(peach, orange juice, pineapple)
                  4.Chocolate dream" + "(peanut butter, chocolate protein powder, almond milk, banana)
                  5.No Smoothie"
                  0. Exit
                """);
        //lines 53 and 54 were from last capstone
        int choice = ConsoleHelper.promptForInt("Enter Your Choice:");

        String baseType = "";
        double basePrice = 8.00;
        //default base price is 8.00 because the bowls are starting at the lowest price.
        switch (choice) {
            case 1 -> {
                baseType = "Acai berry";
            }
            case 2 -> {
                baseType = "Green ";
            }
            case 3 -> {
                baseType = "Peachy Beem";
            }
            case 4 -> {
                baseType = "Chocolate Dream";
            }
            case 5 -> {
                System.out.println("No Smoothie");
                basePrice = 0.0;
            }
            case 0 -> {
                System.out.println("Exiting program, come back soon!");
            }
            default -> {
                System.out.println("Invalid Entry! Please try again ˙◠˙");
            }
        }

        //modifying our sizes:

        System.out.println("Choose a size:");
        System.out.println("1. Small");
        System.out.println("2.Medium");
        System.out.println("3.Large");

        int pickSize = ConsoleHelper.promptForInt("Enter Your Choice:");
        String size = "";
        double sizeAdjustment = 0;

        switch (pickSize) {
            case 1 -> {
                size = "small";
            }

            case 2 -> {
                size = "medium";
                sizeAdjustment = 2.00;
            }


            case 3 -> {
                size = "large";
                sizeAdjustment = 4.00;
            }

        }

        //smoothie final price is the base PLUS the adjustment size price
        double smoothieFinalPrice = basePrice + sizeAdjustment;
        return new SmoothieBase(size, baseType, smoothieFinalPrice);


    }

    @Override
    public String toString() {
        return size + " " + baseType + " $" + price;

    }
}



