/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class ApplianceStore {
   private String serialNumber;
   private String price;
   
   ArrayList < Blender> blenders =  new  ArrayList <> ();
   ArrayList < Toaster> toasters =  new  ArrayList <> ();
   ArrayList < CoffeeMaker> coffemakers =  new  ArrayList <> ();
   ArrayList < TV> tvs =  new  ArrayList <> ();
   ArrayList < DVD> dvds =  new  ArrayList <> ();
   ArrayList < Computer> computers =  new  ArrayList <> ();
  

    public ApplianceStore(String serialNumber, String price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ApplianceStore{" + "serialNumber=" + serialNumber + ", price=" + price +'}';
    }
   
        
      /**
     * @return the serialnumber
     */
    public String getSerialnumber() {
        return serialNumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(String serialnumber) {
        this.serialNumber = serialnumber;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    } 
}