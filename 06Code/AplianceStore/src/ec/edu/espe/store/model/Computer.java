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
public class Computer extends ApplianceStore{
    private String storage;
    private String power;
    private String brand;

    public Computer(String serialNumber, String price, String storage, String power, String brand) {
        super(serialNumber, price);
        this.storage = storage;
        this.power = power;
        this.brand = brand;
    }

    
    @Override
    public String toString() {
        return "Computer{" +super.toString()+ ", storage=" + storage + "GB" + ", power=" + power + "GHz" + ", brand=" + brand + '}';
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<Blender> getBlenders() {
        return blenders;
    }

    public void setBlenders(ArrayList<Blender> blenders) {
        this.blenders = blenders;
    }
      
        
    

       
    
}
