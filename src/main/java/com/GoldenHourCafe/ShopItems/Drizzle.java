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

    public int getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
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

        public int getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


        public static com.GoldenHourCafe.ShopItems.Drizzle optionForDrizzle(String type) {
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
                return new com.GoldenHourCafe.ShopItems.Drizzle(false, 6);
            }
            int choice;
            while (true) {
                choice = ConsoleHelper.promptForInt("Enter Your Drizzle Number! (please type 1-6");
                if (choice >= 1 && choice <= 6) break;
                System.out.println("Invalid Selection! Try Again....");
            }


            public void int getDrizzleName (String type){
                switch (type) {
                    case 1 -> {
                        type = "Peanut Butter";
                    }
                    case 2 -> {
                        type = "Almond Butter";
                    }
                    case 3 -> {
                        type = "Honey";
                    }
                    case 4 -> {
                        type = "Organic Greek Yogurt";
                    }
                    case 5 -> {
                        type = "Agave";
                    }
                    default -> type = "No Drizzle Added";
                }
                ;
                //TO DO: FINISH FIXING SWITCH CASE AND FINISH WRITING LOGIC FOR CHOICES
                System.out.println();


            }

        }
        @Override
        public String toString () {
            return wantDrizzle + " " + type;
        }
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
            return new Drizzle(false, 6);
        }
        int choice;
        while (true) {
            choice = ConsoleHelper.promptForInt("Enter Your Drizzle Number! (please type 1-6");
            if (choice >= 1 && choice <= 6) break;
            System.out.println("Invalid Selection! Try Again....");
        }


        public void int getDrizzleName (String type){
            switch (type) {
                case 1 -> {
                    type = "Peanut Butter";
                }
                case 2 -> {
                    type = "Almond Butter";
                }
                case 3 -> {
                    type = "Honey";
                }
                case 4 -> {
                    type = "Organic Greek Yogurt";
                }
                case 5 -> {
                    type = "Agave";
                }
                default -> type = "No Drizzle Added";
            }
            ;

            System.out.println();


        }

        }
        @Override
        public String toString () {
            return wantDrizzle + " " + type;
    }
}
