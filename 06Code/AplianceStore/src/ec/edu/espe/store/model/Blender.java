/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import com.mongodb.BasicDBObject;
import java.util.ArrayList;


/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Blender extends ApplianceStore {
    private String model;
    private String size;
    private String brand;

    public Blender(String model, String size, String brand, String serialNumber, String price) {
        super(serialNumber, price);
        this.model = model;
        this.size = size;
        this.brand = brand;
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

    public ArrayList<Blender> getBlenders() {
        return blenders;
    }

    public void setBlenders(ArrayList<Blender> blenders) {
        this.blenders = blenders;
    }

    public ArrayList<Toaster> getToasters() {
        return toasters;
    }

    public void setToasters(ArrayList<Toaster> toasters) {
        this.toasters = toasters;
    }

    public ArrayList<CoffeeMaker> getCoffemakers() {
        return coffemakers;
    }

    public void setCoffemakers(ArrayList<CoffeeMaker> coffemakers) {
        this.coffemakers = coffemakers;
    }

    public ArrayList<TV> getTvs() {
        return tvs;
    }

    public void setTvs(ArrayList<TV> tvs) {
        this.tvs = tvs;
    }

    public ArrayList<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(ArrayList<DVD> dvds) {
        this.dvds = dvds;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }
    
    
    

}
    
