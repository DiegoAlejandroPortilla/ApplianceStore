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
    public static void main(String[] args) throws IOException{
        
        int selectedProduct;
        int selectedOption;
        int selectedFormat;
        Object blender;
        Object coffeeMaker;
        Object computer;
        Object dvd;
        Object microwave;
        Object tv;
        Object toaster;
        
        Scanner sc = new Scanner(System.in);
        ApplianceStore applianceStore = new ApplianceStore();
        
        
        do{
        System.out.println("Welcome to the system Appliance Store \n");
        System.out.println("---------------------");
        System.out.println("|Select the product |");
        System.out.println("---------------------");
        System.out.println("|                   |");
        System.out.println("|1-> Blender        |");
        System.out.println("|2-> CoffeeMaker    |");
        System.out.println("|3-> Computer       |");
        System.out.println("|4 -> DVD           |");
        System.out.println("|5 -> Microwave     |");
        System.out.println("|6 -> TV            |");
        System.out.println("|7 -> Toaster       |");
        System.out.println("|                   |");
        System.out.println("|8. Exit            |");
        System.out.println("---------------------");
        selectedOption=sc.nextInt();
            while(selectedOption<1 || selectedOption>=9){
                System.out.println("Error, Choose a correct option : ");
                selectedOption = sc.nextInt();
            }
         switch(selectedOption){
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("|    Blender                      |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    blender = writeDatablender();
                    applianceStore.addBlender(blender);
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct == 2){
                    
                }
                break;
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("|    CoffeeMaker                  |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    coffeeMaker = writeDatacoffeemaker();
                    applianceStore.addCoffeeMarker(coffeeMaker);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break;
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("|    Computer                     |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    computer=writeDatacomputer();
                    applianceStore.addComputer(computer);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break; 
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("|    DVD                          |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    dvd =writeDatadvd();
                    applianceStore.addDvd(dvd);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break;
            case 5:
                System.out.println("-----------------------------------");
                System.out.println("|    Microwave                    |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    microwave=writeDatamicrowave();
                    applianceStore.addMicroave(microwave);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break;
            case 6:
                System.out.println("-----------------------------------");
                System.out.println("|    TV                           |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    tv=writeDatatv();
                    applianceStore.addTv(tv);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break;
            case 7:
                System.out.println("-----------------------------------");
                System.out.println("|    Toaster                      |");
                System.out.println("-----------------------------------");
                System.out.println("|1->Enter the data of the product |");
                System.out.println("|2->Read the data of the product  |");
                System.out.println("-----------------------------------");
                selectedProduct=sc.nextInt();
                selectedProduct = optionValidation(selectedProduct);
                if (selectedProduct == 1){
                    toaster=writeDatatoaster();
                    applianceStore.addToaster(toaster);
                    System.out.println("-----------------------------------");
                    System.out.println("|       Save the data in          |");
                    System.out.println("-----------------------------------");
                    System.out.println("|1->Json                          |");
                    System.out.println("|2->Csv                           |");
                    System.out.println("-----------------------------------");
                    selectedFormat=sc.nextInt();
                    selectedFormat = optionValidation(selectedFormat);
                    if (selectedFormat == 1){
                        
                    }else if(selectedFormat == 2){
                        
                    }
                }else if (selectedProduct ==2){
                    
                }
                break;
            case 8:
                System.exit(0);
                break;
         }
        }while(selectedOption!=8);
}
    
    public static int optionValidation(int selectedOption){
        
        Scanner sc = new Scanner(System.in);
        
        while(selectedOption<1 || selectedOption>2){
            System.out.println("Error, Choose a correct option : ");
            selectedOption = sc.nextInt();
        }  
        return selectedOption;
    } 
    public static Object writeDatablender() throws IOException{
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        
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
    
        System.out.println(blender);
        
       return blender;
    }
    public static Object writeDatacomputer(){
        
        int power;
        String brand; 
        float price; 
        int storage; 
        int serialNumber; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter data to csv");                           
        System.out.println("Enter the serial number :");
        serialNumber=sc.nextInt();
        System.out.println("Enter the brand :");
        brand=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the storage :");
        storage=sc.nextInt();
        System.out.println("Enter the power :");
        power = sc.nextInt();
        
        Computer computer = new Computer();
        computer.setSerialNumber(serialNumber);
        computer.setBrand(brand);
        computer.setPrice(price);
        computer.setStorage(storage);
        computer.setPower(power);
               
        System.out.println(computer);
        
        return computer;
    }
    public static Object writeDatadvd() throws IOException{
        
        float size;
        float price;
        String model;
        int serialnumber;
        
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
               
        System.out.println(dvd);
        
        return dvd;
    }
    public static Object writeDatatv() throws IOException{
        
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        
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
               
        System.out.println(tv);
        return tv;
    }
    public static Object writeDatamicrowave() throws IOException{
        
        float size;
        float weight;
        String material;
        float price;
        String model;
        int serialnumber;
        
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
               
        System.out.println(microwave);
        
        return microwave;
    }
    public static Object writeDatacoffeemaker() throws IOException{
        
        float size;
        int ability;
        String material;
        float price;
        String model;
        int serialnumber;
        
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
               
        System.out.println(coffeemaker);
        
        return coffeemaker;
    }
    public static Object writeDatatoaster(){
        
        float size;
        float weight;
        String material;
        float price;
        String model;
        int power;
        int serialNumber;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter data to csv");                           
        System.out.println("Enter the serial number :");
        serialNumber=sc.nextInt();
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
        System.out.println("Enter the power");
        power = sc.nextInt();
        
        Toaster toaster = new Toaster();
        toaster.setSerialNumber(serialNumber);
        toaster.setModel(model);
        toaster.setPrice(price);
        toaster.setMaterial(material);
        toaster.setSize(size);
        toaster.setWeight(weight);
        toaster.setPower(power);
               
        System.out.println(toaster);
        return  toaster;
    }
}
