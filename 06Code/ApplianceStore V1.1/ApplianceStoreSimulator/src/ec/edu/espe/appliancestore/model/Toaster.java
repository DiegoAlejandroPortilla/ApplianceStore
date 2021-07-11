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
    private int serialNumber;

    @Override
    public String toString() {
        return "Toaster{" + "size=" + size + ", weight=" + weight + ", material=" + material + ", price=" + price + ", model=" + model + ", power=" + power + ", serialNumber=" + serialNumber + '}';
    }

    public Toaster(float size, float weight, String material, float price, String model, int power, int serialNumber) {
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.price = price;
        this.model = model;
        this.power = power;
        this.serialNumber = serialNumber;
    }
    public Toaster(){
        
        size= 0.0F;
        weight = 0.0F;
        material = "";
        price = 0.0F;
        model = "";
        power = 0;
        serialNumber = 0;
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
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
