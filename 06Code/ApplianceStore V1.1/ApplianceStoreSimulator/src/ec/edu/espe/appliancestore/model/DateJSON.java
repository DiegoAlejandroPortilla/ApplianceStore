/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.appliancestore.view.Simulator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class DateJSON {
    
   public static void writeDatacomputer() throws IOException{
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
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonComputer;
        jsonComputer = gson.toJson(computer);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Amounts.json")) {
                 writer.write(gson.toJson(computers));
             }
            
    }
     
}
