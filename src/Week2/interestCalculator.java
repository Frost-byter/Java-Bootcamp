package Week2;

import java.util.Scanner;

public class interestCalculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        interestCalculator();
    }
        //void is a return type but does not have a return
        //Needs a return type that matches the data type
    public static void interestCalculator() {//method declared and defined between lines 14-30
        System.out.println("Welcome to Simple Interest Calculator");


        System.out.println("Enter Principal: ");
        double firstnumber = scan.nextDouble();

        System.out.println("Enter Interest: ");
        double secondnumber = scan.nextDouble() / 100;

        System.out.println("Enter Time: ");
        double thirdnumber = scan.nextDouble();

        double interestAmount = (firstnumber * (1 + (secondnumber * thirdnumber)) - firstnumber);
        System.out.println(interestAmount);

    }
    
}



