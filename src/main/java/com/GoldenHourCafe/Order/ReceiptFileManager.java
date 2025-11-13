package com.GoldenHourCafe.Order;

import com.GoldenHourCafe.*;
import com.GoldenHourCafe.ShopItems.*;

import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

public class ReceiptFileManager {
    public static void writeReceipt(ArrayList<SmoothieBase> bowls, ArrayList<Juice> juices, ArrayList<Side> sides, double totalPrice){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
    }

}
