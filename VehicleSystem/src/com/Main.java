package com;

import java.io.*;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main() throws IOException, ClassNotFoundException {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running){
            System.out.println("Menu");
            System.out.println("1. Add vehicle");
            System.out.println("2. Display vehicles");
            System.out.println("3.Send data to file");
            System.out.println("4.Read data from file");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.print("Enter vno :");
                int vno = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter make :");
                String make = scanner.nextLine();
                System.out.print("Enter Battery (kWh) :");
                int  battery = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Charging Time : ");
                int  chargingTime = scanner.nextInt();
                scanner.nextLine();
                Vehicle v1 = new ElectricVehicle(vno,make,battery,chargingTime);
                vehicles.add(v1);
                System.out.println();
            } else if(choice == 2){
                for(Vehicle v : vehicles){
                    System.out.println("--------Vehicle List----------");
                    v.showSpecs();
                    System.out.println();
                }
            } else if(choice == 3){
                String filename = "vehicles.dat";

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
                for (Vehicle v: vehicles){
                    oos.writeObject(v);
                }
            } else if(choice == 4){
              ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicles.dat"));

              while(true){
                  try {
                      Vehicle v = (Vehicle) ois.readObject();
                      System.out.println(v.make);
                  } catch(EOFException e){
                      System.out.println(e.getMessage());
                      break;
                  } catch (ClassNotFoundException e) {
                      System.out.println(e.getMessage());
                  }
              }
            } else if(choice == 5){
                System.out.println("Exiting System.......");
                running = false;
            }
        }
    }
}
