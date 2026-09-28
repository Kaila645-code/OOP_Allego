/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_pre.final_allego_activity;

/**
 *
 * @author User
 */
public class Q2_ElectricityBill {

    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    
    public Q2_ElectricityBill(String accountNumber, String customerName,
            String customerType, double previousReading,
            double currentReading) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

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

    
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    
    public double getRate() {

        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 100) {
                return 10.00;
            } else if (consumption <= 200) {
                return 12.00;
            } else {
                return 15.00;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 100) {
                return 15.00;
            } else if (consumption <= 200) {
                return 18.00;
            } else {
                return 22.00;
            }
        }

        return 0.00;
    }

    
    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    
    public String getClassification() {

        double consumption = calculateConsumption();

        if (consumption < 100) {
            return "Low Consumption";
        } else if (consumption <= 200) {
            return "Moderate Consumption";
        } else {
            return "High Consumption";
        }
    }


    public void displayBill() {

        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Previous Reading: " + (int) previousReading);
        System.out.println("Current Reading: " + (int) currentReading);
        System.out.println("Consumption: " + (int) calculateConsumption() + " kWh");
        System.out.printf("Rate: $%.2f%n", getRate());
        System.out.printf("Total Bill: $%,.2f%n", calculateBill());
        System.out.println("Classification: " + getClassification());

        if (calculateConsumption() > 300) {
            System.out.println("WARNING: VERY HIGH ELECTRICITY CONSUMPTION");
        }

        System.out.println();
    }
}
