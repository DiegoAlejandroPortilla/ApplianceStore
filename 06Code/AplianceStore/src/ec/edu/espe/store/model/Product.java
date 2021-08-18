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
public class Product extends ApplianceStore {
    private String type;
    private String model;
    private String size;
    private String brand;

    public Product(String type, String model, String size, String brand, String serialNumber, String price) {
        super(serialNumber, price);
        this.type = type;
        this.model = model;
        this.size = size;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    
}
    
    


