/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinal_Exercises;

/**
 *
 * @author User
 */
public class WaterBill {
    // Private properties - Encapsulation
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    // Constructor
    public WaterBill(String accountNumber, String customerName,
                     String customerType, double previousReading,
                     double currentReading) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    // Calculate water consumption
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    // Get rate based on customer type and consumption
    public double getRate() {

        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 10) {
                return 15.00;
            } else if (consumption <= 20) {
                return 18.00;
            } else {
                return 22.00;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 10) {
                return 20.00;
            } else if (consumption <= 20) {
                return 25.00;
            } else {
                return 30.00;
            }
        }

        return 0.00;
    }

    // Calculate total bill
    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    // Get consumption classification
    public String getClassification() {

        double consumption = calculateConsumption();

        if (consumption > 30) {
            return "High Consumption";
        } else if (consumption > 20) {
            return "Moderate Consumption";
        } else {
            return "Normal Consumption";
        }
    }

    // Display water bill
    public void displayBill() {

        System.out.println("===== WATER BILL =====");
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.printf("Consumption: %.0f m³%n", calculateConsumption());
        System.out.printf("Rate: ₱%.2f%n", getRate());
        System.out.printf("Total Bill: ₱%.2f%n", calculateBill());
        System.out.println("Classification: " + getClassification());

        // Warning if consumption is greater than 30
        if (calculateConsumption() > 30) {
            System.out.println("WARNING: HIGH WATER CONSUMPTION");
        }

        System.out.println();
    }
}



