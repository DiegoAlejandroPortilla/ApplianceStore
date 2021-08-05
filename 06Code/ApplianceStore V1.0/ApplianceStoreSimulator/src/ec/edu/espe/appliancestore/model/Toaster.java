/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Toaster {
    private float size;
    private float weight;
    private String material;
    private float price;
    private String model;
    private int power;
    private int serialnumber;

    public Toaster(float size, float weight, String material, float price, String model, int power, int serialnumber) {
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.price = price;
        this.model = model;
        this.power = power;
        this.serialnumber = serialnumber;
    }

    Toaster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Toaster{" + "size=" + size + ", weight=" + weight + ", material=" + material + ", price=" + price + ", model=" + model + ", power=" + power + ", serialnumber=" + serialnumber + '}';
    }
    
    
        
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Gain generateprofit(){
    return new Gain();
    
    }
}
