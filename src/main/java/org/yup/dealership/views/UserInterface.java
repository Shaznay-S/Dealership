package org.yup.dealership.views;

import org.yup.dealership.models.Dealership;

import java.util.Scanner;

public class UserInterface {

    private Dealership autoNation;
    static Scanner employeeScanner = new Scanner(System.in);
    public static String mainInterface() {

        System.out.println("WELCOME to the Auto Nation\n");
        System.out.println("Where promises are delivered to you!\n");
        System.out.println("Please choose from the menu OPTIONS:\n");
        System.out.println("\t1 -> to search by PRICE");
        System.out.println("\t2 -> to search by MAKE and MODEL");
        System.out.println("\t3 -> to search by YEAR");
        System.out.println("\t4 -> to search by COLOR");
        System.out.println("\t5 -> to search by MILEAGE");
        System.out.println("\t6 -> to search by VEHICLE TYPE");
        System.out.println("\t7 -> to view ALL our inventory\n");
        System.out.print("Please enter your NUMBER CHOICE: ");
        employeeScanner.nextLine();

        return "";
    }

}

