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
public class Blender {
    private int velocity;
    private int ability;
    private float price;
    private int serialnumber;

    @Override
    public String toString() {
        return "\nBlender ↓" + "\n velocity = " + velocity + "\n ability = " + ability + "\n price = " + price + "\n serialnumber = " + serialnumber;
    }

    public Blender(){
        this.serialnumber = 0;
        this.price = 0.0F;
        this.velocity = 0;
        this.ability = 0;
        }
    
    public Blender(int serialnumber,float price,int velocity , int ability ){
        this.serialnumber = serialnumber;
        this.price = price;
        this.velocity = velocity;
        this.ability = ability;
        
    }
    
    public String [] getArray(){
        String[] date = {"serialnumber -> " + String.valueOf(serialnumber)+ " price ->" +String.valueOf(price)+ " velocity -> "+String.valueOf(velocity)+" revolutions "+" ability-> "+String.valueOf(ability)+ " liters"};
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
     * @return the velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the ability
     */
    public int getAbility() {
        return ability;
    }

    /**
     * @param ability the ability to set
     */
    public void setAbility(int ability) {
        this.ability = ability;
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
