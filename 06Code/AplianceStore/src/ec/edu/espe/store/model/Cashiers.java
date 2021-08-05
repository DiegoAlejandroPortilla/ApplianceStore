/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;


/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Cashiers extends Users{
    
    public Cashiers(String username, String firstName, String lastName, String phoneNumber, String email, String address, boolean gender, String password) {
        super(username, firstName, lastName, phoneNumber, email, address, gender, password);
    }
    
}
