/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import ec.edu.espe.store.model.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class FileManager{
    
    public static void createFile(String fileName){
        
        File file = new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void writeFile(String fileName,String fileInput){
        
        File file = new File(fileName);
      
        if (!file.exists()){
            System.out.println("The file -> " + file.getName() + " <- not exists");
        } else {
            try {
                FileWriter writer = new FileWriter(fileName,true);
                writer.write(fileInput);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String[] readFile(String fileName){
        
        File file;
        String data[];
        int i;    
        
        file = new File(fileName);
        data = new String[500];
        
        for (int j=0;j<data.length;j++){
        data[j] = null;
        }
        
        try {
            Scanner sc = new Scanner(file);
            i = 0;
            while (sc.hasNextLine()){
                data[i] = sc.nextLine();
                ++i;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return data;
    }
    
    public static void deleteFile(String fileName){
        
        File file = new File(fileName);
      
        if (!file.exists()){
            System.out.println("The file -> " + file.getName() + " <- not exists");
        }else{
            if (file.delete()){
                System.out.println("the file was deleted successfully");
            }else{
                System.out.println("the file could not be deleted");
            }
        }
    }
    
    public static User deserializationJsonUser(String jsonUser){
    
                
        Gson gson = new Gson();
        User user = gson.fromJson(jsonUser, User.class);
       
        return user;
    }
    
}
