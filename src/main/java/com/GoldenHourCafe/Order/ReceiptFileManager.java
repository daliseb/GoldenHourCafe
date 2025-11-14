package com.GoldenHourCafe.Order;

import com.GoldenHourCafe.ShopItems.*;
import com.GoldenHourCafe.UserInterface.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

public class ReceiptFileManager {
    public static void writeReceipt(ArrayList<SmoothieBase> bowls, ArrayList<Juice> juices, ArrayList<Side> sides){

        // saves everything to this folder
        File file = new File("Receipts");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String time = now.format(timeFormatter);

        // Creating a file name:
        String filename = time + ".txt";
        String filePath = file + File.separator + filename;

        try(FileWriter fileW = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fileW);) {

            bw.write("Order ID: " + filename);
            bw.write(time);
            bw.write("-------------------------");

            if(!bowls.isEmpty()){
                bw.write("\n ----- SMOOTHIE BOWLS -----\n");
                for (SmoothieBase bowl : bowls) {
                    bw.write(bowl.toString());
                }
            }

            if(!juices.isEmpty()){
                bw.write("\n ----- FRESH PRESSED JUICE -----\n");
                for (Juice juice : juices) {
                    bw.write(juice.toString());
                }
            }

            if(!sides.isEmpty()){
                bw.write("\n ----- SIDES -----\n");
                for (Side side : sides) {
                    bw.write(side.toString());
                }
            }

            bw.write("--");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
