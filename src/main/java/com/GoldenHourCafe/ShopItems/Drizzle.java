package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;

public class Drizzle {
    private Boolean wantDrizzle; //option for drizzle
    private String type;  //what kind

    //price was deleted because the drizzle IS included in the order and acquires no additional cost.

    public Drizzle(Boolean wantDrizzle, String type) {
        this.wantDrizzle = wantDrizzle;
        this.type = type;
    }

    public Boolean getWantDrizzle() {
        return wantDrizzle;
    }

    public void setWantDrizzle(Boolean wantDrizzle) {
        this.wantDrizzle = wantDrizzle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Drizzle optionForDrizzle(String type) {
        System.out.println("""
                ----Select Your Drizzle!----
                1.Peanut Butter
                2.Almond Butter
                3.Honey
                4.Organic Greek Yogurt
                5.Agave
                6.None
                """);

        boolean wantDrizzle = ConsoleHelper.promptForBoolean("Would You Like Drizzle? (y/n)");
        //following if statement, is made in case user wants no drizzle
        if (!wantDrizzle) {
            System.out.println("No Drizzle Added");
            return new com.GoldenHourCafe.ShopItems.Drizzle(false, "None");
        }
        int choice;
        while (true) {
            choice = ConsoleHelper.promptForInt("Enter Your Drizzle Number! (please type 1-6");
            if (choice >= 1 && choice <= 6) break;
            System.out.println("Invalid Selection! Try Again....");
        }

        //following same structure as Juice class:
        String drizzleType = getDrizzleName(choice);
        System.out.println("Drizzle Has Been Added!" + " " + type);
        return new Drizzle(true, drizzleType);
    }
        //switch case here to convert answers to a numerical value:
        private static String getDrizzleName(int choice) {
            return switch(choice){
                case 1
                case 2
                case 3
                case 4
                case 5


            };


        }



//        @Override
//        public String toString () {
//    return wantDrizzle + " " + type;
//}

            }



