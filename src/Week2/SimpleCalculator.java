package Week2;

import java.util.Scanner;

public class SimpleCalculator {

	//Java reads line by line, so organize code blocks accordingly
	//secondnumber = secondnumber / 100; use this to get the percentage value of a 


	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {


		System.out.println("Welcome to Simple Interest Calculator");


		System.out.println("Enter Principal: ");
		double firstnumber = scan.nextDouble();

		System.out.println("Enter Interest: ");
		double secondnumber = scan.nextDouble();

		System.out.println("Enter Time: ");
		double thirdnumber = scan.nextDouble();

		double interestAmount = scan.nextDouble();


		//double P = firstnumber;
		//double R = secondnumber;
		//double T = thirdnumber;
		//declaring variables


		secondnumber = secondnumber / 100;
		interestAmount = firstnumber * (1 + (secondnumber * thirdnumber));
		System.out.println(interestAmount);

		//return interestAmount;


		/*public static float interest(float I) {

			System.out.println("Your total interest amount is " + I);


			//interest = total Amount(a) - Principal(p)

			float interest = 0;//initialize the variable interest
			float I = interest;//assign the value of the variable(interest) to "I"

			double a = Amount(0);


			return interest;

		}*/

	}
}
