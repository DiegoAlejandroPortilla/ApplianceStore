/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import com.google.gson.Gson;
import ec.edu.espe.store.model.Users;
import java.util.ArrayList;
import utils.FileManager;


/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class FileUsersController {
    
    String fileName = "Users.json";
 
    public String jsonSerialization(Object userType){
        
        Gson gson = new Gson();
        String jsonObject = gson.toJson(userType);    
        
        return jsonObject;   
    }
    public void saveUser(String user){
        
        FileManager.createFile(fileName);
        FileManager.writeFile(fileName,user + "\n");
    }
    
}
