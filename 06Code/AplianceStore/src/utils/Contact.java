/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ec.edu.espe.store.view.FrmMenu;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Contact {

    public Contact() {
    try{   
        try {
                
                Desktop.getDesktop().browse(new URI("https://wa.me/593995047657?text=Hola,%20quisiera%20saber%20mas%20informaci%C3%B3n%20acerca%20de%20un%20producto"));
            } catch (IOException ex) {
                Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
}
        
    }
    
}
