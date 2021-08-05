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
public class Heater extends ApplianceStore{
    
    private String size;
    private String model;
    private String Brand;

    public Heater(String size, String model, String Brand, String serialNumber, String price) {
        super(serialNumber, price);
        this.size = size;
        this.model = model;
        this.Brand = Brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public ArrayList<Blender> getBlenders() {
        return blenders;
    }

    public void setBlenders(ArrayList<Blender> blenders) {
        this.blenders = blenders;
    }
    
    
}
