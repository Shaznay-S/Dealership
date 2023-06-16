package org.yup.dealership.models;

import java.util.ArrayList;

public class Dealership {

    private String dealershipName;
    private String dealershipAddress;
    private String dealershipPhoneNumber;
    private ArrayList<Vehicle> inventory;
    private int dealershipID;

    public Dealership(String dealershipName, String dealershipAddress,
                      String dealershipPhoneNumber, ArrayList<Vehicle> inventory) {
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
        this.dealershipPhoneNumber = dealershipPhoneNumber;
        this.inventory = inventory;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(){
        return getVehiclesByPrice();
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(){
        return getVehiclesByMakeModel();
    }

    public  ArrayList<Vehicle> getVehiclesByYear(){
        return getVehiclesByYear();
    }

    public ArrayList<Vehicle> getVehiclesByColor(){
        return getVehiclesByColor();
    }

    public ArrayList<Vehicle> getVehiclesByMileage(){
        return getVehiclesByMileage();
    }

    public ArrayList<Vehicle> getVehiclesByType(){
        return getVehiclesByType();
    }

    public ArrayList<Vehicle> getInventory(){
        return getInventory();
    }

    public void addVehicle(){

    }

    public void removeVehicle(){

    }
}

