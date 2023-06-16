package org.yup.dealership.models;

public class SalesContract extends Contract {

    private final double salesTax = .05;
    private final double recordingFee = 100;

    public SalesContract(String contractDate, String customerName, String customerEMail, Vehicle contractVehicle, double totalPrice) {
        super(contractDate, customerName, customerEMail, contractVehicle, totalPrice);
    }

    public double getProcessingFee(){
        if(getContractVehicle().getPrice() < 10000){
            return 295;
        }else{
            return 495;
        }
    }

    public double getSalesTax(){
        return (getContractVehicle().getPrice()/100) * salesTax;
    }

    //base price of the car, the processing fee, apply sales tax and that's the total price
    @Override
    public double getTotalPrice() {
        return getContractVehicle().getPrice() + getSalesTax() + recordingFee + getProcessingFee();
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
