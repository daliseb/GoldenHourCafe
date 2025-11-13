package com.GoldenHourCafe.Order;

import com.GoldenHourCafe.ShopItems.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

public class ReceiptFileManager {
    public static void writeReceipt(ArrayList<SmoothieBase> bowls, ArrayList<Juice> juices, ArrayList<Side> sides, double totalPrice){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String time = now.format(timeFormatter);

        // Creating a file name:
        String filename = time + ".txt";
        try {
            FileWriter fileW = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fileW);

            bw.write(time);

            if(!bowls.isEmpty()){
                bw.write("\n ----- SMOOTHIE BOWLS -----\n");
                for (SmoothieBase bowl : bowls) {
                    bw.write(String.valueOf(bowl));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
