package personalproject.calculator;
import java.util.Scanner;
	
public class calculator {
	public static void main(String[]args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in); //scanner
 		System.out.println("Enter the numbers: "); //ask user

		num1 = sc.nextDouble(); //enter number
		num2 = sc.nextDouble(); //enter number
		System.out.println("Enter the operator(*,+,-,/)"); //asks for what operator to use

		char op =  sc.next().charAt(0); 

		double o = 0;

		switch(op) { //method for all operations
		case '+':
			o = num1 + num2;

			break;

		case '-':
			o = num1 - num2;

			break;

		case '*':
			o = num1 * num2;

			break;
		case '/':
			o = num1 / num2;

			break;
		default:
			System.out.println("You entered the wrong input"); //wrong input will be seen
		} 
		System.out.println("The final result: ");
		System.out.println();

		System.out.println(num1 + " " + op + " " + num2 + " = " + o); //shows final result.


	}
}
