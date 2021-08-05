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
public class CoffeeMaker extends ApplianceStore {
    private String size;
    private String ability;
    private String material;
    private String model;

    public CoffeeMaker(String serialNumber, String price,String size, String ability, String material, String model) {
        super(serialNumber, price);
        this.size = size;
        this.ability = ability;
        this.material = material;
        this.model = model;
    }
    
    
     

    @Override
    public String toString() {
        return "CoffeeMaker{" +super.toString() + ", size=" + size + "Cm" + ", ability=" + ability + " liters "+ ", material=" + material + ", model=" + model + '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
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
