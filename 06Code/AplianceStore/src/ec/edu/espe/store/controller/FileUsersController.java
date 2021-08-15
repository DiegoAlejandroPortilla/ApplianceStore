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
 
    public String jsonSerialization(Object data){
        
        Gson gson = new Gson();
        String jsonObject = gson.toJson(data);    
        
        return jsonObject;   
    }
    public void saveUser(String data){
        
        FileManager.createFile(fileName);
        FileManager.writeFile(fileName,data + "\n");
    }

    public boolean usernameExist(String username,String password){
        
        ArrayList<Users> userss;
        String jsonData;
        Gson gson;
        boolean usernameExist;
        
        userss = new ArrayList<>();
        gson = new Gson();
        usernameExist = false;
        
        for (int i = 0;i<FileManager.readFile(fileName).length;i++){
            if (FileManager.readFile(fileName)[i]!=null){
                jsonData = FileManager.readFile(fileName)[i];
                Users user = gson.fromJson(jsonData, Users.class);
                userss.add(user);
            }
        }
           
        if(!userss.isEmpty()){
            for (int j=0;j<userss.size();j++){
                if(userss.get(j).getUsername().equals(username) && userss.get(j).getPassword().equals(password)){
                    usernameExist = true;
                }
            }
        }
        
        return usernameExist;
    }
    
    public String getUserName(String username,String password){
        
       ArrayList<Users> userss;
        String jsonData;
        Gson gson;
        String userName;
        
        userss = new ArrayList<>();
        gson = new Gson();
        userName = "";
        
        for (int i = 0;i<FileManager.readFile(fileName).length;i++){
            if (FileManager.readFile(fileName)[i]!=null){
                jsonData = FileManager.readFile(fileName)[i];
                Users user = gson.fromJson(jsonData, Users.class);
                userss.add(user);
            }
        }
           
        if(!userss.isEmpty()){
            for (int j=0;j<userss.size();j++){
                if(userss.get(j).getUsername().equals(username) && userss.get(j).getPassword().equals(password)){
                    userName = userss.get(j).getFirstName();
                }
            }
        }
        
        return userName;
    }
}
