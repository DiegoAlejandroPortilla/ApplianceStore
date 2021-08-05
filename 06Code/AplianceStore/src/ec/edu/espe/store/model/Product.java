/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Product {
    private String type;
    private String serialNumber;
    private String price;
    private String model;
    private String size;
    private String brand;

    public Product(String type, String serialNumber, String price, String model, String size, String brand) {
        this.type = type;
        this.serialNumber = serialNumber;
        this.price = price;
        this.model = model;
        this.size = size;
        this.brand = brand;
    }

     public Product(BasicDBObject object){
        type = object.getString("type");
        serialNumber = object.getString("serialNumber");
        price = object.getString("price");
        model = object.getString("model");
        size = object.getString("size");
        brand = object.getString("brand");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
