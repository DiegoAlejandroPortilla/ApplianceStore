/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.DVD;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
import ec.edu.espe.appliancestore.model.DateCSV;
import ec.edu.espe.appliancestore.model.DateJSON;
import ec.edu.espe.appliancestore.model.Microwave;
import ec.edu.espe.appliancestore.model.TV;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 * @author Salazar Matthew NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<>();
        Blender blendersArray[] = new Blender[3];
        int selection;
        int select;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("---------------------");
        System.out.println("|Select the product |");
        System.out.println("---------------------");
        System.out.println("|1-> Blender        |");
        System.out.println("|2-> CoffeeMaker   |");
        System.out.println("|3-> Computer       |");
        System.out.println("|4 -> DVD           |");
        System.out.println("|5 -> Microwave     |");
        System.out.println("|6 -> TV            |");
        System.out.println("|7 -> Toaster       |");
        System.out.println("---------------------");
        select=sc.nextInt();
        
        switch(select){
            case 1:    
                System.out.println("---------------------");
                System.out.println("|    Blender        |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){
    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                         
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    System.out.println("------------------------|");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }
        }
        break;    
        case 2:
            
                System.out.println("---------------------");
                System.out.println("|   CoffeeMaker    |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){   
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                            
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(3):
              
                System.out.println("---------------------");
                System.out.println("|     Computer      |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                   
                }else{
                        if (selection==2){
                            
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        DateJSON.writeDatacomputer();
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(4) :  
                System.out.println("---------------------");
                System.out.println("|       DVD         |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (5):
                System.out.println("---------------------");
                System.out.println("|     Microwave     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                            
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                       
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (6):
                System.out.println("---------------------");
                System.out.println("|       TV          |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                           
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case(7):
                System.out.println("---------------------");
                System.out.println("|       Toaster     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break;
        }
    

} 
    
        
    
    public static void writeDateblender() throws IOException{
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        Blender blendersArray[] = new Blender[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
                   
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");
        
        blendersArray[0] = blender;
            
             
             
        
    }
    public static void writeDatedvd() throws IOException{
        float size;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<DVD>dvds=new ArrayList<DVD>();
        DVD dvdsArray[] = new DVD[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
        
        System.out.println("Ingrese el model :");
        model=sc.nextLine();                    
        System.out.println("Ingrese el SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el price:");
        price=sc.nextFloat();
        System.out.println("Ingrese la size:");
        size=sc.nextFloat();
        
               
        DVD dvd = new DVD();
        System.out.println("DVD object -> " + dvd);
        
        dvd = new DVD(serialnumber,price,size,model);
        System.out.println("DVD object -> " + dvd);
                   
        dvds.add(dvd);
               
        System.out.println("DVD -> " + dvds + "\n");
        dvdsArray[0] = dvd;
    }
    public static void writeDatetv() throws IOException{
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        ArrayList<TV>tvs=new ArrayList<TV>();
        TV tvsArray[] = new TV[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
        System.out.println("Ingrese el color:");
        color=sc.nextLine();
        System.out.println("Ingrese la definition:");
        definition=sc.nextLine();
        System.out.println("Ingrese el model :");
        model=sc.nextLine();                    
        System.out.println("Ingrese el SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio:");
        price=sc.nextFloat();
        System.out.println("Ingrese la size:");
        size=sc.nextFloat();
        
        
        
        TV tv = new TV();
        System.out.println("TV object -> " + tv);
        
        tv = new TV(serialnumber,price,size,color,definition,model);
        System.out.println("TV object -> " + tv);
                   
        tvs.add(tv);
               
        System.out.println("TV -> " + tvs + "\n");
        tvsArray[0] = tv;
  
        
    }
    public static void writeDatacomputer() throws IOException{
        DateJSON.writeDatacomputer();
            
    }
    public static void writeDatamicrowave() throws IOException{
        float size;
        float weight;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        Microwave MicrowavesArray[] = new Microwave[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the weight :");
        weight = sc.nextFloat();
        
        Microwave microwave = new Microwave();
        System.out.println("Microwave object -> " + microwave);
        
        microwave = new Microwave(size, weight, material, price, model, serialnumber);
        System.out.println("Microwave object -> " + microwave);
                   
        microwaves.add(microwave);
               
        System.out.println("Microwave -> " + microwaves + "\n");
        
        MicrowavesArray[0] = microwave;
    }
    public static void writeDatecoffeemaker() throws IOException{
        float size;
        int ability;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<CoffeeMaker>coffeemakers=new ArrayList<CoffeeMaker>();
        CoffeeMaker CoffeeMakersArray[] = new CoffeeMaker[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the ability :");
        ability = sc.nextInt();
        
        CoffeeMaker coffeemaker = new CoffeeMaker();
        System.out.println("CoffeeMaker object -> " + coffeemaker);
        
        coffeemaker = new CoffeeMaker(size, ability, material, price, model, serialnumber);
        System.out.println("CoffeeMaker object -> " + coffeemaker);
                   
        coffeemakers.add(coffeemaker);
               
        System.out.println("CoffeeMaker -> " + coffeemakers + "\n");
        
        CoffeeMakersArray[0] = coffeemaker;
        

    
    }

    
}