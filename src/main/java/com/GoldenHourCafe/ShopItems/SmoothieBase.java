package com.GoldenHourCafe.ShopItems;


import com.GoldenHourCafe.UserInterface.ConsoleHelper;

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
        System.out.println("Select Your Flavor");
        System.out.println("1.Acai berry \n" + "(Mixed berry blend, acai, oat milk)\n");
        System.out.println("2.Green Blend \n" + "(pineapple, spinach, kale, coconut water)\n");
        System.out.println("3.Peachy Beem\n" + "(peach, orange juice, pineapple)\n");
        System.out.println("4.Chocolate dream\n" + "(peanut butter, chocolate protein powder, almond milk, banana)\n");


        //lines 53 and 54 were from last capstone
        String choice = ConsoleHelper.promptForString("Enter Your Choice:");
        choice = choice.toUpperCase();



















    }









    @Override
    public String toString() {
        return size + " " + baseType + " " + price;
    }
}
