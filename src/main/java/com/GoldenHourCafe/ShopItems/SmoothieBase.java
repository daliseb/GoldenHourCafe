package com.GoldenHourCafe.ShopItems;
import com.GoldenHourCafe.UserInterface.ConsoleHelper;
import com.GoldenHourCafe.UserInterface.OrderItem;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;

//an example of polymorphism:
public class SmoothieBase extends OrderItem {
    private String size;   //small medium large
    private String baseType;  //what kind??
    private double price;   //base price
    private static ArrayList<Topping> toppings;
    private static Drizzle drizzle;

    //constructors
    public SmoothieBase(String size, String baseType, double price, ArrayList<Topping> toppings,Drizzle drizzle) {
        this.size = size;
        this.baseType = baseType;
        this.price = price;
        this.toppings = toppings;
        this.drizzle =drizzle;


    }
    public SmoothieBase(){
        this.toppings = new ArrayList<>(); //I want to initilize toppings list
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

//    public double getPrice() {
//        return price;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static ArrayList<Topping> getToppings() {
        return toppings;
    }

    public static void setToppings(ArrayList<Topping> toppings) {
        SmoothieBase.toppings = toppings;
    }

    public static Drizzle getDrizzle() {
        return drizzle;
    }

    public void setDrizzle(Drizzle drizzle) {
        SmoothieBase.drizzle = drizzle;
    }

    //method to set the flavors of smoothie bases
    public static SmoothieBase baseOption() {
        SmoothieBase order = new SmoothieBase();

        //lines 53 and 54 were from last capstone
        System.out.println("""
                ( ----------------❀❀❀ Choose Your Base ❀❀❀------------------ );
                  1. Acai berry      (Mixed berry blend, acai, oat milk)
               
                  2. Green Blend     (pineapple, spinach, kale, coconut water)
                
                  3. Peachy Beem     (peach, orange juice, pineapple)
                
                  4. Chocolate dream (peanut butter, chocolate protein powder, almond milk, banana)
                
                  0. Exit
                """);
        //lines 53 and 54 were from last capstone
        int choice = ConsoleHelper.promptForInt("Enter Your Choice");

        String baseType = "";
        double basePrice = 8.00;
        //default base price is 8.00 because the bowls are starting at the lowest price.


            switch (choice) {
                case 1 -> baseType = "Acai berry";
                case 2 -> baseType = "Green Blend ";
                case 3 -> baseType = "Peachy Beem";
                case 4 -> baseType = "Chocolate Dream";
                case 0 -> {
                    System.out.println("Exiting program, come back soon!");
                    return null;
                }
                default -> System.out.println("Invalid Entry! Please try again ˙◠˙");
            }

            //modifying our sizes:
            System.out.println("Choose a size");
            System.out.println("1. Small");
            System.out.println("2. Medium (+2) ");
            System.out.println("3. Large (+4) ");

            int pickSize = ConsoleHelper.promptForInt("Enter Your Choice");
            String size = "";
            double sizeAdjustment = 0;


            switch (pickSize) {
                case 1 -> {
                    size = "Small";
                }

                case 2 -> {
                    size = "Medium";
                    sizeAdjustment = 2.00;
                }


                case 3 -> {
                    size = "Large";
                    sizeAdjustment = 4.00;
                }

            }

            //smoothie final price is the base PLUS the adjustment size price
            double smoothieBaseFinalPrice = basePrice + sizeAdjustment;
            setToppings(Topping.chooseToppings(pickSize));
            order.setDrizzle(Drizzle.optionForDrizzle());

            return new SmoothieBase(size, baseType, smoothieBaseFinalPrice, getToppings(), getDrizzle());


        }

    @Override
    public double getPrice(){
        double total = price;

        //topping prices:

        for (Topping t : toppings){
            total += t.getPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        return size + " " + baseType +"\n" + "Price: $ " +getPrice() + "\n" + "Toppings Added: " + "\n" + toppings + "\n" + "Drizzle Selected:" + drizzle + "Total: $" + getPrice() ;
    }
}



