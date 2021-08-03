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
public class DVD {
    private float size;
    private float price;
    private String model;
    private int serialnumber;
   
 public DVD(){
        this.size = 0.0F;
        this.price = 0.0F;
        this.model = "";
        this.serialnumber = 0;
    }
 
public DVD(float size, float price, String model, int serialnumber){
        this.size = size;
        this.price = price;
        this.model = model;
        this.serialnumber = serialnumber;
} 


    public DVD(int serialnumber, float price, float size, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "DVD{" + "size=" + size + ", price=" + price + ", model=" + model + ", serialnumber=" + serialnumber + '}';
    }

public String [] getArray(){
        String[] date = {"serialnumber -> " + String.valueOf(serialnumber)+ "model ->" + String.valueOf(model)+ " price ->" +String.valueOf(price)+ " qualsize->"+String.valueOf(size)};
     return date;
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

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the serialnumber
     */
    public int getSerialnumber() {
        return serialnumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }
}
