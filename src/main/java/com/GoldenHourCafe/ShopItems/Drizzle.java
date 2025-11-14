package com.GoldenHourCafe.ShopItems;

import com.GoldenHourCafe.UserInterface.ConsoleHelper;
import com.GoldenHourCafe.UserInterface.OrderItem;

public class Drizzle{
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

    public static Drizzle optionForDrizzle() {
        boolean wantDrizzle = ConsoleHelper.promptForBoolean("Would You Like Drizzle? (y/n)\n");
        System.out.println("""
                ----୨ৎ Select Your Drizzle ୨ৎ----
                1.Peanut Butter
                2.Almond Butter
                3.Honey
                4.Organic Greek Yogurt
                5.Agave
                6.None
                """);


        //following if statement, is made in case user wants no drizzle
        if (!wantDrizzle) {
            System.out.println("No Drizzle Added");
            return new com.GoldenHourCafe.ShopItems.Drizzle(false, "None");
        }
        int choice;
        while (true) {
            choice = ConsoleHelper.promptForInt("Enter Your Drizzle Number (please type 1-6");
            if (choice >= 1 && choice <= 6) break;
            System.out.println("Invalid Entry! Please try again ˙◠˙");
        }

        //following same structure as Juice class:
        String drizzleType = getDrizzleName(choice);
        System.out.println(getDrizzleName(choice) + " " + "Drizzle Has Been Added"  );
        return new Drizzle(true, drizzleType);
    }

    //switch case here to convert answers to a numerical value:
    private static String getDrizzleName(int choice) {
        return switch (choice) {
            case 1 -> "Peanut Butter";
            case 2 -> "Almond Butter";
            case 3 -> "Honey";
            case 4 -> "Organic Greek Yogurt";
            case 5 -> "Agave";
            case 6 -> "None";
            default -> "No Drizzle Added";
        };

    }

    @Override
    public String toString() {
        return type;
    }

}



