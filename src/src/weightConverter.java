package src;
import java.util.Scanner;

public class weightConverter {

	public static void main(String[] args) {
	// Weight conversion program
		
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		double weight= 0;
		boolean isValidWeight = false;
		
		System.out.println("Weight Conversion Program");
		System.out.println("1. lbs to kgs");
		System.out.println("2. kgs to lbs");

		
		do {
			System.out.println("Please choose an option:");
			if(scanner.hasNextInt()) {
				option = scanner.nextInt();
				
				if (option != 1 && option != 2){
					System.out.println("Please enter a valid option, which contains only '1' or '2'");
				}
			}else {
				System.out.println("Please enter a valid option, which contains only '1' or '2'");
				scanner.next();
			}
		}
		while (option != 1 && option != 2);
		
		// 1. lbs to kgs
		
		if (option == 1) {
			System.out.println("Enter the weight from lbs type:");
			do {
				if (scanner.hasNextDouble()){
					weight = scanner.nextDouble();
					
					if(weight <= 0) {
						System.out.println("Please enter a weight greater than 0:");
					} else
						isValidWeight = true;
				} else {
					System.out.println("Please enter the answer with only numbers");
					System.out.println("Enter the weight from kgs type:");
					scanner.next();
				}
				
			} while (isValidWeight == false);
			
			weight *= 0.45359237;
			System.out.println("Equivalent of kgs of your weight is " + weight + " kilograms");
		}
		
		// 2. kgs to lbs
		
		else if (option == 2) {
			System.out.println("Enter the weight from kgs type:");
			do {
				
				if (scanner.hasNextDouble()) {
					weight = scanner.nextDouble();
					
					if(weight <= 0) {
						System.out.println("Please enter a weight greater than 0:");
					} else
						isValidWeight = true;
				} else {
					System.out.println("Please enter the answer with only numbers.");
					System.out.println("Enter the weight from kgs type:");
					scanner.next();
				}
						
			} while (isValidWeight == false);
					
			weight *= 2.20462262;
			System.out.println("Equivalent of lbs of your weight is " + weight + " pounds.");
		}
		scanner.close();
	}
}
