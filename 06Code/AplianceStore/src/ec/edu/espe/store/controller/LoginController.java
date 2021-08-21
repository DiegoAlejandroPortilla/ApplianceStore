/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import com.google.gson.Gson;
import ec.edu.espe.store.model.User;
import utils.FileManager;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class LoginController {
    
     public boolean registerControl(String user,String password){
        
        String fileName;
        String jsonData;
        boolean permit;
        Gson gson;
        
        gson = new Gson();
        permit = false;
        fileName = "Users.json";
        
        for (int i = 0;i<FileManager.readFile(fileName).length;i++){
            if (FileManager.readFile(fileName)[i]!=null){
                jsonData = FileManager.readFile(fileName)[i];
                User jsonUser = gson.fromJson(jsonData, User.class);
                if(jsonUser.getUsername().equals(user) && jsonUser.getPassword().equals(password)){
                    permit = true;
                }
            }
        }
        
        return permit;
    }

     public String getUserJson(String userName,String password){
        
            
        String fileName;
        String jsonData;
        String userData = "";
        Gson gson;
        User jsonUser;
        
        gson = new Gson();
        fileName = "Users.json";
        
        for (int i = 0;i<FileManager.readFile(fileName).length;i++){
            if (FileManager.readFile(fileName)[i]!=null){
                jsonData = FileManager.readFile(fileName)[i];
                jsonUser = gson.fromJson(jsonData, User.class);
                if(jsonUser.getUsername().equals(userName) && jsonUser.getPassword().equals(password)){
                    userData = jsonData;
                }  
            }
        }
         return userData;
     }
        
}
