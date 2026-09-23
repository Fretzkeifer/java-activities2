/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prefinal_exercises2;

/**
 *
 * @author User
 */

    abstract class InternetPlan {
    private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    public InternetPlan(String planCode, String customerName,
                        double monthlyFee, int monthsSubscribed) {
        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    public String getPlanCode() {
        return planCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }

    public abstract double calculateMonthlyBill();
    public abstract String getSpeed();
    public abstract String getPlanDescription();

    public double getDiscountRate() {
        return 0.0;
    }

    public String getClassification() {
        if (monthsSubscribed >= 12) {
            return "LONG-TERM SUBSCRIBER";
        } else if (monthsSubscribed >= 6) {
            return "REGULAR SUBSCRIBER";
        } else {
            return "NEW SUBSCRIBER";
        }
    }
}

class BasicPlan extends InternetPlan {

    public BasicPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 999.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 6) {
            return getMonthlyFee() * 0.95;
        }
        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }

    @Override
    public double getDiscountRate() {
        return getMonthsSubscribed() >= 6 ? 5.0 : 0.0;
    }
}

class StandardPlan extends InternetPlan {

    public StandardPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 1499.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.90;
        }
        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "100 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Standard";
    }

    @Override
    public double getDiscountRate() {
        return getMonthsSubscribed() >= 12 ? 10.0 : 0.0;
    }
}

class PremiumPlan extends InternetPlan {

    public PremiumPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 2499.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.85;
        }
        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }

    @Override
    public double getDiscountRate() {
        return getMonthsSubscribed() >= 12 ? 15.0 : 0.0;
    }
}

public class InternetSubscriptionSystem {

    public static void main(String[] args) {

        InternetPlan[] plans = {
            new BasicPlan("B001", "Juan Dela Cruz", 6),
            new StandardPlan("S001", "Ana Reyes", 12),
            new PremiumPlan("P001", "Maria Santos", 15)
        };

        System.out.println("===== INTERNET SUBSCRIPTION =====");

        for (InternetPlan plan : plans) {
            System.out.println("\nCustomer: " + plan.getCustomerName());
            System.out.println("Plan: " + plan.getPlanDescription());
            System.out.println("Speed: " + plan.getSpeed());
            System.out.printf("Monthly Fee: ₱%,.2f%n", plan.getMonthlyFee());
            System.out.println("Months Subscribed: " + plan.getMonthsSubscribed());
            System.out.printf("Discount: %.0f%%%n", plan.getDiscountRate());
            System.out.printf("Monthly Bill: ₱%,.2f%n",
                    plan.calculateMonthlyBill());
            System.out.println("Classification: " + plan.getClassification());
            System.out.println("--------------------------------");
        }
    }
}


