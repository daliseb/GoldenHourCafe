package com.GoldenHourCafe;

public class Side {
    private Boolean wantSide; //a question, sides are NOT required.
    private String type;
    private String price;

    public Side(Boolean wantSide, String type, String price) {
        this.wantSide = wantSide;
        this.type = type;
        this.price = price;
    }
    
}
