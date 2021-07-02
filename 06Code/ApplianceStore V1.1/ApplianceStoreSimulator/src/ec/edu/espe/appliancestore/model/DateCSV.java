/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class DateCSV {
    
   public static void writeCSVcomputer() throws IOException{
      int power;
      String brand;
      float price;
      int storage;
      int serialNumber;  
      ArrayList<Computer>computers=new ArrayList<Computer>();
      Computer computersArray[] = new Computer[3];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter data to csv");
      
        System.out.println("Enter the amount of RAM: ");
        power=sc.nextInt();
        System.out.println("Enter brand: ");
        brand=sc.nextLine();
        System.out.println("Enter the price: ");
        price=sc.nextInt();
        System.out.println("Enter storage capacity: ");
        storage=sc.nextInt();
        System.out.println("Enter the serialNumber: ");
        serialNumber=sc.nextInt();
        
        Computer computer = new Computer();
        System.out.println("Computer object -> " + computer);
        
        computer = new Computer(power, brand, price, storage, serialNumber);
        System.out.println("Computer object -> " + computer);
        
        computers.add(computer);
        System.out.println("Computers -> " + computers + "\n");
        
        computersArray[0] = computer;
        String fileOutput = "ApplianceStore.csv";
        boolean exists = new File(fileOutput).exists();
        
        if(exists){
            File computerFile = new File(fileOutput);
            computerFile.delete();
        }
        
        try{
          CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
          
            outputCSV.write("Power");            
            outputCSV.write("Brand");
            outputCSV.write("Price");
            outputCSV.write("Storage");
            outputCSV.write("SerialNumber");
            
            outputCSV.endRecord();
            
            for(Computer ComputerArray : computers){
                outputCSV.write(String.valueOf(ComputerArray.getPower()));
                outputCSV.write(String.valueOf(ComputerArray.getBrand()));
                outputCSV.write(String.valueOf(ComputerArray.getPrice()));
                outputCSV.write(String.valueOf(ComputerArray.getStorage()));
                outputCSV.write(String.valueOf(ComputerArray.getSerialNumber()));
                
                outputCSV.endRecord();  
            }
            outputCSV.close(); 
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
   
