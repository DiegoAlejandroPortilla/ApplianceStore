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
public class DVD extends ApplianceStore {
    
    private String size;
    private String model;

    public DVD(String serialNumber, String price,String size, String model) {
        super(serialNumber, price);
        this.size = size;
        this.model = model;
    }
    
   

    @Override
    public String toString() {
        return "DVD{" +super.toString() + ", size=" + size + "Cm" + ", model=" + model + '}';
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

    public ArrayList<Blender> getBlenders() {
        return blenders;
    }

    public void setBlenders(ArrayList<Blender> blenders) {
        this.blenders = blenders;
    }


   
    
}
