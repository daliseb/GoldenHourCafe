package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;
import com.GoldenHourCafe.UserInterface.OrderItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Topping extends OrderItem {
    private Boolean wantTopping; //optional
    private String name;  //name of topping
    private String type; //two types of toppings, premium/regular
    private Boolean extra;   //extra topping
    private double price;    //base price of topping

    //constructor
    public Topping(Boolean wantTopping, String name, String type, Boolean extra, double price) {
        this.wantTopping = wantTopping;
        this.name = name;
        this.type = type;
        this.extra = extra;
        this.price = price;
    }

    //get and set
    public Boolean getWantTopping() {
        return wantTopping;
    }

    public void setWantTopping(Boolean wantTopping) {
        this.wantTopping = wantTopping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getExtra() {
        return extra;
    }

    public void setExtra(Boolean extra) {
        this.extra = extra;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //array list has to be made, because user is choosing MULTIPLE toppings at once
    public static ArrayList<Topping> chooseToppings(int size) {
        ArrayList<Topping> toppings = new ArrayList<>();

        System.out.println("Select Your Toppings:");

        System.out.println("""
              --Regular Toppings: (Included)--            --Premium Toppings: (Prices Vary)--
                1. Cacao Nibs                              7.Sea Moss Gel
                2.Chopped Strawberries                     8.Hemp Seeds
                3.Kiwi Slices                              9.Bee Pollen
                4.Mango Slices                             10.Protein Scoop (Vanilla)
                5.Chopped Pineapple                        11.Protein Scoop (Chocolate)
                6.Coconut Shreds                           12.Scoop Of Collagen
             """);

        //while loop is needed for the user being able to choose a topping without stopping until deciding to (:
        while (true) {
            int choice = ConsoleHelper.promptForInt("Select Your Toppings, Choose 0 When Finished :");
            if (choice == 0) break;    //user will put 0, when they are done adding toppings


            //determines whether a topping is premium or regular:
//            Topping topping = null;
            String type = (choice <= 6) ? "Regular" : "Premium";
            double basePrice = calculateToppingPrice(size, type);
            boolean extra = false;
            String name = "";

            switch (choice) {

                case 1 -> name = "Cacao Nibs";
                case 2 -> name = "Chopped Strawberries";
                case 3 -> name = "Kiwi Slices";
                case 4 -> name = "Mango Slices";
                case 5 -> name = "Chopped Pineapple";
                case 6 -> name = "Coconut Shreds";
                case 7 -> name = "Sea Moss Gel";
                case 8 -> name = "Hemp Seeds";
                case 9 -> name= "Bee Pollen";
                case 10 -> name = "Protein Scoop (Vanilla)";
                case 11 -> name = "Protein Scoop (Chocolate)";
                case 12 -> name = "Scoop Of Collagen";
                default -> {
                    System.out.println("Invalid Choice, Try Again");
                    continue;
                }
            }

//if statement to prompt the action of calculating the prem
            if (type.equals("Premium")) {
                extra = ConsoleHelper.promptForBoolean("Extra Topping? (y/n)");

                if (extra) {
                    basePrice += calculateExtraPremiumSize(size);
                }
            }
            //need method to add topping to list?????
//            if (topping != null){
//                toppings.add(topping);
//                System.out.println("you have added" + topping.getName());
//
//
//            }
            Topping topping = new Topping(true, name, type, extra, basePrice);
            toppings.add(topping);
            System.out.println("Topping Added: " + topping.getName() + topping.getPrice() );

        }
        return toppings;
    }
    //need to calculate topping price:
    //size and type are being defined here:
    private static double calculateToppingPrice(int size, String type) {
        return switch(type){
            case "Regular" -> switch (size) {
                case 1 -> 0.25;
                case 2 -> 0.50;
                case 3 -> 0.75;
                default -> 0.25;

            };

            case "Premium" -> switch (size) {
                case 1 -> 0.50;
                case 2 -> 0.75;
                case 3 -> 1.00;
                default -> 0.50;

            };

            default -> 0.00;
        };
    }
    //only size is needed, cost of topping has been determined above^
    private static double calculateExtraPremiumSize(int size){
        return switch(size) {
            case 1 -> 0.25;
            case 2 -> 0.50;
            case 3 -> 0.75;
            default -> 0.25;
        };

    }
    @Override
    public double getPrice(){
        return price;
    }


    @Override
    public String toString() {
        return name + type + (extra ? "Extra" : "") + " $" + price;
    }
}