package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;

public class Topping {
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
    public static List<Topping> chooseToppings() {
        List<Topping> toppings = new ArrayList<>();

        System.out.println("Select Your Toppings:");

        System.out.println("""
                        --Regular Toppings: (Included)");
                        1. Cacao Nibs
                        2.Chopped Strawberries
                        3.Kiwi Slices
                        4.Mango Slices
                        5.Chopped Pineapple
                        6.Coconut Shreds
                        
                        Premium Toppings: (Prices Vary)
                        7.Sea Moss Gel
                        8.Hemp Seeds
                        9.Bee Pollen
                        10.Protein Scoop (Vanilla)
                        11.Protein Scoop (Chocolate)
                        12.Scoop Of Collagen
                        
                        """);

        //while loop is needed for the user being able to choose a topping without stopping until deciding to (:
        while(true) {
            int choice = ConsoleHelper.promptForInt("Select Your Topping: (number only please)");
            if (choice == 0) break;

            Topping topping = null;
            String type = (choice <= 3) ? "Regular" : "Premium";
            double basePrice = calculateToppingPrice(size, type);

            switch (choice) {
                case 1 -> topping = new Topping(true, "Cacao Nibs", "Regular", false, basePrice);
                case 2 -> topping = new Topping(true, "Chopped Strawberries", "Regular", false, basePrice);
                case 3 -> topping = new Topping(true, "Kiwi Slices", "Regular", false, basePrice);
                case 4 -> topping = new Topping(true, "Mango Slices", "Regular", false, basePrice);
                case 5 -> topping = new Topping(true, "Chopped Pineapple", "Regular", false, basePrice);
                case 6 -> topping = new Topping(true, "Coconut Shreds", "Regular", false, basePrice);
                case 7 -> topping = new Topping(true, "Sea Moss Gel", "Premium", false, basePrice);
                case 8 -> topping = new Topping(true, "Hemp Seeds", "Premium", false, basePrice);
                case 9 -> topping = new Topping(true, "Bee Pollen", "Premium", false, basePrice);
                case 10 -> topping = new Topping(true, "Protein Scoop (Vanilla)", "Premium", false, basePrice);
                case 11 -> topping = new Topping(true, "Protein Scoop (Chocolate)", "Premium", false, basePrice);
                case 12 -> topping = new Topping(true, "Scoop Of Collagen", "Premium", false, basePrice);
                default -> System.out.println("Invalid Choice, Try Again");

            }
//if statement
            if (topping != null && type.equals("Premium")) {
                boolean extra = ConsoleHelper.promptForBoolean("Extra Topping? (y/n");

                if (extra) {
                    topping.extra = true;
                    topping.price += calculateExtraPremiumPrize(size);
                }

            }

            if (topping != null) {
                toppings.add(topping);
                System.out.println("you have added" + topping);


            }
        }
        return toppings;














            }



    @Override
    public String toString() {
        return wantTopping+ " " + name + " " + type + " " + extra + price;
    }
}