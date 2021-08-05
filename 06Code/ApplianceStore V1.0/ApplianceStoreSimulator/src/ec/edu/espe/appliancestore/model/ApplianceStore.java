/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class ApplianceStore {
   private int serialnumber;
   ArrayList < Microwave> microwaves =  new  ArrayList <> ();
   ArrayList < Toaster> toasters =  new  ArrayList <> ();
   ArrayList < Blender> blenders =  new  ArrayList <> ();
   ArrayList < CoffeeMaker> coffemakers =  new  ArrayList <> ();
   ArrayList < TV> tvs =  new  ArrayList <> ();
   ArrayList < DVD> dvds =  new  ArrayList <> ();
   ArrayList < Computer> computers =  new  ArrayList <> ();

    @Override
    public String toString() {
        return "ApplianceStore{" + "serialnumber=" + serialnumber + ", microwaves=" + microwaves + ", toasters=" + toasters + ", blenders=" + blenders + ", coffemakers=" + coffemakers + ", tvs=" + tvs + ", dvds=" + dvds + ", computers=" + computers + '}';
    }
   
   public Microwave add(Microwave microwaves){
       return new Microwave();
    }
   public Toaster add(Toaster toaster){
       return new Toaster();
    }
   public Blender add(Blender blenders){
       return new Blender();
    }
   public CoffeeMaker add(CoffeeMaker coffeeMaker){
       return new CoffeeMaker();
    }
   public TV add(TV tvs){
       return new TV();
    }
   public DVD add(DVD dvds){
      return new DVD();
    }
   public Computer add(Computer computers){
      return new Computer();
    }
   public int remove(int serialnumber){
       return 0;
   }
     
    
}
