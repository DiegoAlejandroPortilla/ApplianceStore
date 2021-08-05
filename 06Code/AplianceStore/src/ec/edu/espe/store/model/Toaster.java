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
public class Toaster extends ApplianceStore {
    private String power;
    private String size;
    private String weight;
    private String material;
    private String model;

    public Toaster( String serialNumber, String price, String power,String size,String weight, String material, String model) {
        super(serialNumber, price);
        this.power = power;
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.model = model;
    }

          
    @Override
    public String toString() {
        return "Toaster{" + super.toString() + ", power=" + power + " W " + ", size=" + size + "Cm" + ", weight=" + weight + "Kg" + ", material=" + material + ", model=" + model + '}';
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
