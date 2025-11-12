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

        System.out.println("Regular Toppings: (Included)");
        System.out.println("1.Cacao Nibs");
        System.out.println("2.Chopped Strawberries");
        System.out.println("3.Kiwi Slices");
        System.out.println("4.Mango Slices");
        System.out.println("5.Chopped Pineapple");
        System.out.println("6.Coconut Shreds");

        System.out.println("Premium Toppings: (Prices Vary)");
        System.out.println("7.Sea Moss Gel");
        System.out.println("8.Hemp Seeds");
        System.out.println("9.Bee Pollen");
        System.out.println("10.Protein Scoop (Vanilla)");
        System.out.println("11.Protein Scoop (Chocolate)");
        System.out.println("12.Scoop Of Collagen");

        //while loop is needed for the user being able to choose a topping without stopping until deciding to (:
        while(true) {
            int choice = ConsoleHelper.promptForInt("Select Your Topping: (number only please)");
            if (choice == 0 ) break;

            Topping topping = null;
            String type = (choice <= 3 ) ? "Regular" : "Premium";
            double basePrice = calculateToppingPrice(size,type);







        }












    }










    @Override
    public String toString() {
        return wantTopping+ " " + name + " " + type + " " + extra + price;
    }
}
