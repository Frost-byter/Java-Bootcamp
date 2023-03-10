package Week1;

import java.util.Scanner;
public class passfailcalculator {


    public static void main(String[] args) {


        //Scanner in = new Scanner(System.in);//how do you know if it's a compiler or not

        //System.out.println("What's your grade?: ");

        final int Max_grade = 100;
        final int Min_grade = 0;
        final int A = 90; //
        final int B = 80;
        final int C = 70;
        final int D = 60;
        final int F = 0;

        String message = " ";

        Scanner keyboard;
        keyboard = new Scanner(System.in);// sets up your scanner to receive input from the user

        System.out.println("What's your grade?: ");

        double grade = keyboard.nextDouble();//
         int grade1 = ((int)grade / 100) * 100; //

        if (grade <= Max_grade && grade >= A) { //&& = if both conditions are true, execute
            grade = A;
            message = "Congratulations, you've passed with flying colors!";

        }   else if (grade >= B && grade < A) {
            grade = B;
            message = "Not bad youngblood!";

            } else if (grade >=C && grade < B) {

            grade = C;
            message = "Good try, you passed but just barely.";
        }   else if (grade >=D && grade < C) {

            grade = D;
            message = "Yikes, D's do not get degrees here.";
        }   else if (grade >= Min_grade && grade < D) {

            grade = F;
            message = "Go home, hit the books, you suck";
        }

        switch(grade1) {//Switches only take int or Char data types
            case A :
                System.out.println("Your Grade is: A");
                System.out.println(message);
                break;

            case B :
                System.out.println("Your Grade is: B");
                System.out.println(message);
                break;
            case C :
                System.out.println("Your Grade is: C");
                System.out.println(message);
                break;
            case D :
                System.out.println("Your Grade is: D");
                System.out.println(message);
                break;
            case F :
                System.out.println("Your Grade is: F");
                System.out.println(message);
                break;

            default :
                System.out.println("Invalid input, step correct G");

        }
        keyboard.close();//only one way to find out :)


































        }






















    }
/*
------------------------------------------> *These are notes*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int testGrade; // to hold user entered test score

        // constants for grade ranges
        final int MIN_GRADE = 0;
        final int MAX_GRADE = 100;
        final int A = 90;
        final int B = 80;
        final int C = 70;
        final int D = 60;
        final int F = 0;
        String message = "";

        // user prompt
        System.out.print("Enter the points earned to find out your letter grade: ");
        Scanner input = new Scanner(System.in);
        testGrade = input.nextInt();

        // logic for finding letter grade
        if (testGrade <= MAX_GRADE && testGrade >= A) {
            testGrade = A;
            message = "You earned an A. Excellent!";
        } else if (testGrade >= B && testGrade < A) {
            testGrade = B;
            message = "You earned a B. Very Good!";
        } else if (testGrade >= C && testGrade < B) {
            testGrade = C;
            message = "You earned a C. Good";
        } else if (testGrade >= D && testGrade < C) {
            testGrade = D;
            message = "You earned a D. Try Harder Next Time";
        } else if (testGrade >= MIN_GRADE && testGrade < D) {
            testGrade = F;
            message = "You earned an F. Try Harder Next Time";
        }

        // switch statement for message string
        switch (testGrade) {
            case A:
            case B:
            case C:
            case D:
                System.out.println(message);
                break;
            case F:
                System.out.println(message);
                break;
            default:
                System.out.println("Invalid input");
        }

        input.close();
    }
}*/
