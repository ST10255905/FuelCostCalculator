package com.mycompany.fuelcostcalculator;
import java.util.Scanner;
public class FuelCostCalculator {

    public static void main(String[] args) {
        
        // Create Scanner Object
        Scanner scanner = new Scanner(System.in);
        
        //Prompt user for inputs
        System.out.print("Enter total trip distance (in kilometers):");
        double distance = scanner.nextDouble();
        
        System.out.print("Enter car fuel efficiency (km per liter):");
        double fuelEfficiency = scanner.nextDouble();
        
        System.out.print("Enter fuel price per liter:");
        double fuelPrice = scanner.nextDouble();
        
        //Calculate fuel needed
        double fuelNeeded = distance / fuelEfficiency;
        
        //Calculate total cost
        double totalCost = fuelNeeded * fuelPrice;
        
        //Display result
        System.out.print("Total fuel cost for the trip: " + totalCost);
        
        //Close scanner
        scanner.close();
    }
} 