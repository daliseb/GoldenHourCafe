package com.GoldenHourCafe.ShopItems;

import java.util.List;

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
        List<Topping>




    }










    @Override
    public String toString() {
        return wantTopping+ " " + name + " " + type + " " + extra + price;
    }
}
