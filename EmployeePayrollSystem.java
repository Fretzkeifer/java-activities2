/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinal_Exercises2;

/**
 *
 * @author User
 */
public class EmployeePayrollSystem {
    private String employeeID;
    private String name;
    private String position;
    private double hoursWorked;
    private double hourlyRate;

    public EmployeePayrollSystem(String employeeID, String name, String position, double hoursWorked, double houryRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = houryRate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHouryRate() {
        return hourlyRate;
    }

    public void setHouryRate(double houryRate) {
        this.hourlyRate = houryRate;
    }
    
    public double calculateRegularPay(){
        double reguralHours = Math.min(hoursWorked, 40);
        return reguralHours * hourlyRate;
    }
    
    public double calculateOvertimePay(){
        
        if (hoursWorked > 40 ){
            double overtimeHours = hoursWorked - 40;  
            double overtimeRate = hourlyRate * 1.50;
            return overtimeHours * overtimeRate;
        }
        return 0;
    }
    public double calculateGrossPay(){
        return calculateRegularPay() + calculateOvertimePay();
    }
    public double calculateDeduction(){
        double grossPay = calculateGrossPay();
        if (grossPay <= 10000) { return grossPay * 0.05;
    }else{
            return grossPay * 0.10;
            
   }    }
    public double calculateNetPay(){
        return calculateGrossPay() - calculateDeduction();
    }
    public String getEmployeeClassification(){
        if (hoursWorked < 20){
            return "Part-Time";
        }else if (hoursWorked <= 40) {
            return "Regural";
        }else{
            return "Overtime Worker";
        }
    }
    public void displayPayroll(){
        
        
        System.out.println("===== EMPLOYEE PAYROLL =====");
        System.out.println();
        
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Rate: ₱%.2f%n", hourlyRate);
        
        
        System.out.printf("Regular Pay: ₱%,.2f%n", calculateRegularPay());
        System.out.printf("Overtime Pay: ₱%,.2f%n", calculateOvertimePay());
        System.out.printf("Gross Pay: ₱%,.2f%n", calculateGrossPay());
        System.out.printf("Deduction: ₱%,.2f%n", calculateDeduction());
        System.out.printf("Net Pay: ₱%,.2f%n", calculateNetPay());
        
        
        System.out.println("Classification: " + getEmployeeClassification());
        
        
        System.out.println();
    }

   
}
