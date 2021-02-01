/*
* Class: CMSC 201
* Instructor: Tanveen Ashique
* Description: Project 1:  a program that allows the user to enter temperature or wind speed and then calculates the wind chill temperature.
* Due:02/01/2021
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*Print your Name here:  Mark Kasule
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class WindChillTemperature {

	public static void main(String[] args) {
		
		//Declare constants
    	final double FIRST_CONSTANT = 35.74;
    	final double SECOND_CONSTANT = 0.6215;
    	final double THIRD_CONSTANT = 35.75;
    	final double FORTH_CONSTANT = 0.4275;

        //create a scanner object
        Scanner input = new Scanner(System.in);
        //create decimal number object
        DecimalFormat decimals = new DecimalFormat("#0.00000");

        //Prompt the user to enter temperature
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        
        //Grab input from user and store it into temperature variable
        double temperature = input.nextDouble();

        //Check temperature >= -58 || temperature =< 41F errors
        if(temperature >= -58 && temperature <= 41) {
        	
        	//Ask for wind speed
            System.out.print("Enter the wind speed (>=2) in miles per hour: ");
            double speed = input.nextDouble();
            
            //Check if speed is >=2
            if(speed >= 2) {
            	
            	//calculated speed result
                double speedResult = Math.pow(speed, 0.16);
            	
            	//calculate the wind chill speed temperature
                double windChillTemp = FIRST_CONSTANT + (SECOND_CONSTANT * temperature) - (THIRD_CONSTANT * speedResult) + (FORTH_CONSTANT * temperature * speedResult);
                
                System.out.print("Wind chill temperature is: " + decimals.format(windChillTemp));
            }else {
            	System.out.println("The speed you entered is less than 2");  //If speed is less than 2
            }

        }else{
            System.out.println("Temperature you entered is outside the range needed required!");   //if temperature is less than -58 or greater 41
        }

	}

}
