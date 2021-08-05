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
public class ApplianceStoreManager {
    private String name;
    ApplianceStore storestore;

    @Override
    public String toString() {
        return "ApplianceStoreManager{" + "name=" + name + ", storestore=" + storestore + '}';
    }

    public ApplianceStoreManager(String name, ApplianceStore storestore) {
        this.name = name;
        this.storestore = storestore;
    }
}
