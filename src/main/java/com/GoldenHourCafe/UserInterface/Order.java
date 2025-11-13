package com.GoldenHourCafe.UserInterface;

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
        SmoothieBase sb = new SmoothieBase();
        Juice j = new Juice();
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
                case 1:
                   bowls.add(sb.baseOption());
                    break;
              case 2:
                  drinks.add(j.optionForJuice());

//                case 3 -> addSide();
//                case 4 -> checkOut();
                case 0:
                    System.out.println("Exiting The Program....GoodBye!");
                    return;
                default:
                    System.out.println("Invalid Answer....Try Again!");
                    break;
            }
        }


//        //addjuice
//        addJuice();
//
//
//        //addside
//        addSide();
//
//        //checkout
//        checkOut();
    }
}












