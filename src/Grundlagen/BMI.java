package Grundlagen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Whats youre Name?");
		String name = scanner.next();
		System.out.println("Name: " + name);
		
		System.out.println("Whats youre weight?");
		double weight = scanner.nextDouble();
		System.out.println ("Weight: " + weight);
		
		System.out.println("Whats your height?");
		double height = scanner.nextDouble();
		System.out.println("Height: " + height);
		
		double bmi = weight / (height * height);
		System.out.print("Hello: " + name);
		System.out.print("youre BMI:" + Math.round(bmi));
		scanner.close();
		

	}

}
