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
public class Staff extends Users{
 
    public Staff(String username, String firstName, String lastName, String phoneNumber, String email, String address, String gender, String password, String area) {
        super(username, firstName, lastName, phoneNumber, email, address, gender, password, area);
    }
 
}
