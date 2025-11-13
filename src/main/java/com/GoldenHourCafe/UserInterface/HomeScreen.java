package com.GoldenHourCafe.UserInterface;
                                  //FINISHED
//import java.utiScanner;

//this is my main screen
public class HomeScreen {
    public void homeScreenDisplay(){
        while(true){
            System.out.println("""
                    ---Welcome to Golden Hour Cafe---
                       what would you like to do?
                       1. Make An Order
                       2. Exit
                    """);
            String choice = ConsoleHelper.promptForString("Make your selection");
            switch(choice) {
                case "1":
                    Order order = new Order();
                    order.orderScreen();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
