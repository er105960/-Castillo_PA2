import java.util.Scanner;
public class Prob_2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        
        int formulaChoice;
        
        System.out.print("Welcome to the BMI Calculator. "
        		+ "Press 1 if you would like to use the English system or "
        		+ "Press 0 for the Metric System: ");
        
        formulaChoice = scnr.nextInt(); 
        
        if (formulaChoice == 1) { //English System
	        
	        System.out.print("Height (in inches)? ");
	        double height = scnr.nextDouble();   
	        
	        System.out.print("Weight (in pounds)? ");
	        double weight = scnr.nextDouble();
	        
	        double bmi = ((weight * 703) / (height*height)); // formula 1
	        
	        System.out.printf("BMI = %.1f\n",bmi);
	        if (bmi < 18.5) {
	            System.out.println("Underweight");
	        } else if (bmi < 25) {
	            System.out.println("Normal");
	        } else if (bmi < 30) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }
        }
        
        if (formulaChoice == 0) { //Metric System
	        
	        System.out.print("Height (in centimeters)? ");
	        double height = scnr.nextDouble();
	        
	        height = height/100; //Converts centimeters to meters
	        
	        System.out.print("Weight (in kilograms)? ");
	        double weight = scnr.nextDouble();
	        
	        double bmi = (weight / (height * height)); // formula 2
	        
	        System.out.printf("BMI = %.1f\n",bmi);
	        
	        if (bmi < 18.5) {
	            System.out.println("Underweight");
	        } else if (bmi < 25) {
	            System.out.println("Normal");
	        } else if (bmi < 30) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }
        }
        
        //BMI Categories are displayed
        System.out.printf("\nBMI Categories:\n" + 
        		"Underweight = <18.5\r\n" + 
        		"Normal weight = 18.5–24.9\n" + 
        		"Overweight = 25–29.9\n" + 
        		"Obesity = BMI of 30 or greater");
        
        scnr.close();
    }
}