/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prefinal_exercises2;

/**
 *
 * @author User
 */
public class VehicleRentalSystem {
    protected String vehicleId;
    protected String brand;
    protected String model;
    protected int rentalDays;

    public VehicleRentalSystem(String vehicleId, String brand, String model, int rentalDays) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
    
    
   public double calculateRental(){
       return 0;
   }
   
   public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
       System.out.println("Rental Days: " + rentalDays);
       System.out.printf("Rental Cost: %.2f%n%n", calculateRental());
   }
   
   class Car extaends Vehicle{
       private static final double DAILY_RATE = 1500.00;
       
       public Car(String vehicleId, String brand, String model, int rentalDays){
           
       }
   }
   
 
    

}