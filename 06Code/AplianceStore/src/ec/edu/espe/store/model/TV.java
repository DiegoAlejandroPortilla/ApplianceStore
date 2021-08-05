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
public class TV extends ApplianceStore {
 
    private String size;
    private String color;
    private String definition;
    private String model;

    public TV(String serialNumber, String price,String size, String color, String definition, String model) {
        super(serialNumber, price);
        this.size = size;
        this.color = color;
        this.definition = definition;
        this.model = model;
    }

    
    
    @Override
    public String toString() {
        return "TV{" +super.toString() + ", size=" + size + " inches "+ ", color=" + color + ", definition=" + definition + ", model=" + model + '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Blender> getBlenders() {
        return blenders;
    }

    public void setBlenders(ArrayList<Blender> blenders) {
        this.blenders = blenders;
    }
    
    
    
}