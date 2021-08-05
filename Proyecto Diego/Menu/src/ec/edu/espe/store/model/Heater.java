/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Heater extends ApplianceStore{
    
    float size;
    String model;
    String Brand;

    public Heater(float size, String model, String Brand, int serialNumber, float price) {
        super(serialNumber, price);
        this.size = size;
        this.model = model;
        this.Brand = Brand;
    }
    
    
}
