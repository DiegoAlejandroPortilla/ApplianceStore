/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import ec.edu.espe.appliancestore.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 * @author Salazar Matthew NullPointers ESPE-DCCO
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * 
 */
public class Simulator {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
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
                    writeDateblender();
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
                        writeDateblender();
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
                    writeDatecoffeemaker();
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
                        writeDatecoffeemaker();
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
                   writeDatacomputer();
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
                       writeDatacomputer();
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
                    writeDatedvd();
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
                        writeDatedvd();
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
                    writeDatamicrowave();
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
                       writeDatamicrowave();
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
                    writeDatetv();
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
                        writeDatetv();
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
        
        ArrayList<Blender> blenders= new ArrayList<>();
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
        blender.setSerialnumber(serialnumber);
        blender.setPrice(price);
        blender.setVelocity(velocity);
        blender.setAbility(ability);
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");        
    }
    public static void writeDatedvd() throws IOException{
        
        float size;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<DVD>dvds=new ArrayList<>();
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
        dvd.setModel(model);
        dvd.setSerialnumber(serialnumber);
        dvd.setPrice(price);
        dvd.setSize(size);
        dvds.add(dvd);
               
        System.out.println("DVD -> " + dvds + "\n");
    }
    public static void writeDatetv() throws IOException{
        
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        
        ArrayList<TV> tvs=new ArrayList<>();
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
        tv.setModel(model);
        tv.setDefinition(definition);
        tv.setColor(color);
        tv.setPrice(price);
        tv.setSerialnumber(serialnumber);
        tv.setSize(size);
        tvs.add(tv);
               
        System.out.println("TV -> " + tvs + "\n");  
    }
    public static void writeDatacomputer() throws IOException{
        
        int power;
        String brand;
        float price;
        int storage;
        int serialNumber;  
      
        ArrayList<Computer>computers =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter data to csv");
        System.out.println("Enter the amount of RAM: ");
        power=sc.nextInt();
        System.out.println("Enter brand: ");
        brand=sc.nextLine();
        System.out.println("Enter the price: ");
        price=sc.nextInt();
        System.out.println("Enter storage capacity: ");
        storage=sc.nextInt();
        System.out.println("Enter the serialNumber: ");
        serialNumber=sc.nextInt();
        
        Computer computer = new Computer();
        computer.setBrand(brand);
        computer.setPower(power);
        computer.setPrice(price);
        computer.setSerialNumber(serialNumber);
        computer.setStorage(storage);
        computers.add(computer);
        
        System.out.println("Computers -> " + computers + "\n");     
    }
    public static void writeDatamicrowave() throws IOException{
        
        float size;
        float weight;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<Microwave> microwaves=new ArrayList<>();
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
        microwave.setSerialnumber(serialnumber);
        microwave.setModel(model);
        microwave.setPrice(price);
        microwave.setMaterial(material);
        microwave.setSize(size);
        microwave.setWeight(weight);
        microwaves.add(microwave);
               
        System.out.println("Microwave -> " + microwaves + "\n");
    }
    public static void writeDatecoffeemaker() throws IOException{
        
        float size;
        int ability;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<CoffeeMaker> coffeemakers=new ArrayList<>();
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
        coffeemaker.setAbility(ability);
        coffeemaker.setMaterial(material);
        coffeemaker.setModel(model);
        coffeemaker.setModel(size);
        coffeemaker.setPrice(price);
        coffeemaker.setSerialnumber(serialnumber);
        coffeemakers.add(coffeemaker);
               
        System.out.println("CoffeeMaker -> " + coffeemakers + "\n");
    }
}