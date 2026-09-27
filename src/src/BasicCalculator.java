package src;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number1 = 0, number2 = 0, result = 0;
		char operator = 'a';
		
		System.out.println("Welcome to Basic Calculator program!");
		System.out.println("Please Enter First Number: ");
		number1 = takingNumber(scanner);
		System.out.println("Please Enter an Operator (+, -, *, /, ^, %): ");
		operator = takingOperator(scanner);
		System.out.println("Please Enter Second Number: ");
		number2 = takingNumber(scanner);
		
		if (number2 == 0 && operator == '/') {
			System.out.println("Cannot divide by zero!");
		} else {
			result = calculation(number1, number2, operator);
			System.out.println("Your result is " + result);
		}
		scanner.close();
	}

	public static double takingNumber(Scanner input) {
		double number = 0;
		boolean i = false;
		do {
			if(input.hasNextDouble()) {
				number = input.nextDouble();
				i = true;
			}else {
				System.out.println("Please Enter a Number: ");
				input.next();
			}
		}while(!i);
		return number;
	}
	public static char takingOperator(Scanner input) {
		char opt = 'a';
		boolean i = false;
		do {
			String inputOpt = input.next();
	        if (inputOpt.length() == 1) {
	            opt = inputOpt.charAt(0);
	        } else {
	            System.out.println("Please enter only one operator.");
	        }

			switch (opt) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case '%':
				i = true;
				break;
			default:
					System.out.println("Please Enter an Operator (+, -, *, /, ^, %): ");
				}
		}while (!i);
		return opt;
	}
	public static double calculation(double number1, double number2, char operator) {

		double result = 0;
		switch (operator) {
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
			case '^':
				result = Math.pow(number1, number2);
				break;
			case '%':
				result = number1 % number2;
				break;
		}
		return result;
	}
}



// parametreleri ve variable = method(parameter)'ları ai yardımıyla yaptım
// switch case için ai'dan ilham aldım, normalde tek tek if ( opt == + || opt == - ...) diye yazmıştım sonrasındaysa
// else if dize dize işlemleri yapacaktım
// sadece 2-3 tane matematiksel edge bug kaldı, fixleri için cannot divide by zero gibi else if aça aça en sona else result 
// kalacak şekilde ekleyebilirim ama gereksiz. Amacıma ulaştım.


