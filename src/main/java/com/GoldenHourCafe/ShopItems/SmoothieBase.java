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

        switch(pickSize) {
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
                            --Regular Toppings: (Included);
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
                System.out.println("Choose Option, 0 when finished");
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
    //if statement to prompt the action of calculating the prem
                if (topping != null && type.equals("Premium")) {
                    boolean extra = ConsoleHelper.promptForBoolean("Extra Topping? (y/n)");

                    if (extra) {
                        topping.extra = true;
                        topping.price += calculateExtraPremiumSide(size);
                    }

                }

                if (topping != null) {
                    toppings.add(topping);
                    System.out.println("you have added" + topping.getName());


                }
            }
            return toppings;
            }
        //need to calculate topping price:
            private static double calculateToppingPrice(String size, String type){
                return switch(type) {
                    case "Regular" -> switch (size.toLowerCase()) {
                        case "small" -> 0.25;
                        case "medium" -> 0.50;
                        case "large" -> 0.75;
                        default -> 0.00;

                    };

                    case "Premium" -> switch (size.toLowerCase()) {
                        case "small" -> 0.50;
                        case "medium" -> 0.75;
                        case "large" -> 1.00;
                        default -> 0.00;

                    };

                    default -> 0.00;


                    };




                }

            }
}



