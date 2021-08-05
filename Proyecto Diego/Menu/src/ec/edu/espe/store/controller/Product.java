/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import org.bson.Document;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Product {
    public void addProduct(){
        
        
        Document dc = new Document();
        Connection conection = new Connection();
        dc.append("serialNumber", "123").append("price","12.4").append("velocity", "3").append("ability", "2");
        conection.getCollection().insertOne(dc);
    }
}
