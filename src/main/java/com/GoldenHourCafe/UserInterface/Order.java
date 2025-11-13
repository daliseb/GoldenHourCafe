package com.GoldenHourCafe.UserInterface;

public class Order {
    private Order order = new Order();

//    public void startOrder(){
//        homeScreen();

    //home screen(order screen) starts here:
    private void orderScreen() {
        while (true) {
            System.out.println("""
                    ---Create Your Smoothie Bowl---
                    1.Choose Smoothie Base
                    2.Add Fresh Juice
                    3.Add Sides
                    4.Check Out
                    0.Cancel
                    """);
            int choice = ConsoleHelper.promptForInt("Select Your Option!");

            switch (choice) {
                case 1 -> addSmoothieBase();
                case 2 -> addJuice();
                case 3 -> addSide();
                case 4 -> checkOut();
                case 0 -> System.out.println("Exiting The Program....GoodBye!");
                return;
                default -> {
                    System.out.println("Invalid Answer....Try Again!");
                }
            }
        }
//addSmoothie base
        public static void addSmoothieBase(){

        }





        //addjuice
        addJuice();


        //addside
        addSide();

        //checkout
        checkOut();
    }
}












