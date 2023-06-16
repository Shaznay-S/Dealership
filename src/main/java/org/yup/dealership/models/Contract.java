package org.yup.dealership.models;

public abstract class Contract {

    private String contractDate;
    private String customerName;
    private String customerEMail;
    private Vehicle contractVehicle;
    private double totalPrice;
    private double monthlyPayment;
    private int contractID;

    public Contract(String contractDate, String customerName,
                    String customerEMail, Vehicle contractVehicle, double totalPrice) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEMail = customerEMail;
        this.contractVehicle = contractVehicle;
        this.totalPrice = totalPrice;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEMail() {
        return customerEMail;
    }

    public void setCustomerEMail(String customerEMail) {
        this.customerEMail = customerEMail;
    }

    public Vehicle getContractVehicle() {
        return contractVehicle;
    }

    public void setContractVehicle(Vehicle contractVehicle) {
        this.contractVehicle = contractVehicle;
    }

    public abstract double getTotalPrice();

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public abstract double getMonthlyPayment();

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
