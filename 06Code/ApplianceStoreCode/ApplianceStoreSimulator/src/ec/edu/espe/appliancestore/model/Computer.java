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
public class Computer {
    private int power;
    private String material;
    private float price;
    private String storage;
    private int serialNumber;
    
    public Computer(){
        this.power = 0;
        this.material = "";
        this.price = 0.0F;
        this.storage = "";
        this.serialNumber = 0;
    }
    
    public Computer(int power,String material,float price,String storange,int serialNumber){
        this.power = power;
        this.material = material;
        this.price = price;
        this.storage = storange;
        this.serialNumber = serialNumber;
    }
    
    public Computer(String power, String material, String price, String storange, String serialNumber){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Computer{" + "Power -> " + power + " Material -> " + material + " Price -> " + price + " Storage ->" + storage + ", SerialNumber -> " + serialNumber + '}';
    }
    
    public String [] getArray(){
        String[] date = {"Power -> " + String.valueOf(power)+ " Material ->" +String.valueOf(material)+ " Price -> "+String.valueOf(price)+" Storage -> "+String.valueOf(storage)+ " SerialNumber -> "+String.valueOf(serialNumber)};
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
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
}
