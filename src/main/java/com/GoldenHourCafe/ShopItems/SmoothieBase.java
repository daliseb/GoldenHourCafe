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
        //lines 53 and 54 were from last capstone
        System.out.println("Choose Your Flavor");
        System.out.println("1.Acai berry" + "(Mixed berry blend, acai, oat milk)\n");
        System.out.println("2.Green Blend" + "(pineapple, spinach, kale, coconut water)\n");
        System.out.println("3.Peachy Beem" + "(peach, orange juice, pineapple)\n");
        System.out.println("4.Chocolate dream" + "(peanut butter, chocolate protein powder, almond milk, banana)\n");
        System.out.println("0. Exit");

        //lines 53 and 54 were from last capstone
        int choice = ConsoleHelper.promptForInt("Enter Your Choice:");

        String baseType;
        double basePrice;
    //default base price is 8.00 because the bowls are starting at the lowest price.
        switch(choice){
            case 1 -> {
                baseType = "Acai berry";
                basePrice = 8.00;
            }

            case 2 -> {
                baseType = "Green ";
                basePrice = 8.00;
            }

            case 3 -> {
                baseType = "Peachy Beem";
                basePrice = 8.00;
            }

            case 4 -> {
                baseType = "Chocolate Dream";
                basePrice = 8.00;
            }

            case 0 -> {
                System.out.println("Exiting program, come back soon!");
            }

            default ->
                System.out.println("Invalid Entry! Please try again ˙◠˙");
               











        }





    }



    @Override
    public String toString() {
        return size + " " + baseType + " " + price;
    }
}
