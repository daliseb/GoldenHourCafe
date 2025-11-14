package com.GoldenHourCafe.UserInterface;

import com.GoldenHourCafe.Order.ReceiptFileManager;
import com.GoldenHourCafe.ShopItems.Juice;
import com.GoldenHourCafe.ShopItems.Side;
import com.GoldenHourCafe.ShopItems.SmoothieBase;

import javax.print.attribute.standard.Sides;
import java.util.ArrayList;

public class Order {
    ArrayList<SmoothieBase> bowls = new ArrayList<>();
    ArrayList<Juice> juices = new ArrayList<>();
    ArrayList<Side> sides = new ArrayList<>();
    Double price;

    public Order(ArrayList<SmoothieBase> bowls, ArrayList<Juice> juices, ArrayList<Side> sides, Double price) {
        this.bowls = bowls;
        this.juices = juices;
        this.sides = sides;
        this.price = price;
    }

    public Order(){

    }
    public ArrayList<SmoothieBase> getBowls() {
        return bowls;
    }

    public void setBowls(ArrayList<SmoothieBase> bowls) {
        this.bowls = bowls;
    }

    public ArrayList<Juice> getJuices() {
        return juices;
    }

    public void setJuices(ArrayList<Juice> juices) {
        this.juices = juices;
    }

    public ArrayList<Side> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Side> sides) {
        this.sides = sides;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //    public void startOrder(){
//        homeScreen();

    //home screen(order screen) starts here:
    public void orderScreen() {
        Order order = new Order();
      //  SmoothieBase sb = new SmoothieBase();
//        Juice j = new Juice();
        while (true) {
            System.out.println("""
                    ---SELECT YOUR CHOICE---
                    1.Choose Smoothie Base
                    2.Add Fresh Juice
                    3.Add Sides
                    4.Check Out
                    0.Cancel
                    """);
            int choice = ConsoleHelper.promptForInt("Select Your Option!");

            switch (choice) {
                case 1:
                    order.getBowls().add(SmoothieBase.baseOption());
                    break;
                case 2:
                    order.getJuices().add(Juice.optionForJuice(juices.size()));
                    break;
                case 3:
                    order.getSides().add(Side.optionForSide());
                    break;
                case 4:
                    checkOut(order);
                    break;

                case 0:
                    System.out.println("Exiting The Program....GoodBye!");
                    return;
                default:
                    System.out.println("Invalid Answer....Try Again!");
                    break;
            }
        }
    }
    public void checkOut(Order order){
        System.out.println("--- Checkout ---");
        System.out.println("\nSmoothie Bowl(s): ");
        for (SmoothieBase bowl : order.getBowls()) {
            System.out.println("-" + bowl);
            System.out.println("--------------------");
        }
        System.out.println("\nJuice(s):");
        for(Juice j : order.getJuices()){
            System.out.println("-" + j);
            System.out.println("--------------------");

        }

        System.out.println("\nSide:");
        for(Side s : order.getSides()){
            System.out.println("-" + s);
            System.out.println("--------------------");



        }

        ReceiptFileManager.writeReceipt(order.getBowls(),order.getJuices(), order.getSides());

//        System.out.println(order.bowls);
//        System.out.println(order.juices);
//        System.out.println(order.sides);




    }

}












