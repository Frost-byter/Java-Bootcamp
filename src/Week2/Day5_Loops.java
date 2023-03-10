package Week2;

import java.util.Scanner;

public class Day5_Loops {

    public static void main(String[] args) {
        //while loop
        int count = 0;

        System.out.println("****** While Loop ******");

        while (count < 3) {
            System.out.println(count);
            count++;
        }

        System.out.println();
        //do while loop
        int a = 0;

        System.out.println("****** Do-while loop *******");

        do {
            System.out.println(a);
            a++;
        } while (a < 3);
        System.out.println();

        //for loop
        System.out.println("********* For loop ****");

        for(int i =0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println();

        //for-each loop
        //can only loop over a collection like an array or collection of data
        //need an array because for-each loops can only loop over a collection

        int[] nums = {0, 1, 2};

        System.out.println("****** For-each loop ******");

        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        Scanner in = new Scanner(System.in);

        //carprompt(in);

       // icecream();

        //shortercarPrompt(in);

        foreachicecream();

        in.close();
    }

    public static void foreachicecream() {
        String[] flavors = {"Vanilla,",
                " Chocolate,",
                " Strawberry,",
                " Mint,",
                " Cookie dough,",
                " Rum raisin",
                "Salted Caramel"};

        String[] toppings = {"M&Ms",
                "Chocolate",
                "Oreos",
                "Kit Kats",
                "Sprinkles",
                "Chocolate Syrup",
                "Caramel",
                "Reese's"};

        System.out.println("**** Ice Cream ****");
        //no indexes, executes once for every value in the array
        for (String flavor : flavors) {
            for (String topping : toppings) {
                String bowl = flavor + " and " + topping;

                System.out.println(bowl);
            }
        }
    }


    public static void icecream() {
        String[] flavors = {"Vanilla,",
                " Chocolate,",
                " Strawberry,",
                " Mint,",
                " Cookie dough,",
                " Rum raisin",
                "Salted Caramel"};
        System.out.println("**** Ice Cream ****");
//        for (int i = 0; i < flavors.length; i++) {
//            System.out.println(flavors[i]);
//        }
//        //no difference in my output above from i++
//        System.out.println("**** Ice Cream ****");
//        for (int i = 0; i < flavors.length; ++i) {
//            System.out.println(flavors[i]);


        //everything, except the semi-colo(;) and the () is optional in
        // a for loop
        // where you place i++ or ++i does matter and will cause an error
        // i only exist inside the loop, that's why I'm able to re-use it here

//        System.out.println("**** Ice Cream ****");
//        for (int i = 0; i < flavors.length;) {
//            System.out.println(flavors[i]);
//            ++i; //moving ++i outside the statement resolves the error
//
//        }
//        int j = 0;
//        System.out.println("***** Ice Cream ***");
//        for (; j < flavors.length;){
//            System.out.println(flavors[j]);
//            j++;
//        }

//        int j = 0;
//        System.out.println("***** Ice Cream ***");
//        // for (;;) is an infinite loop
//        // there is no condition to tell it when to stop, so it doesn't until it hits an error
//        for (;;) {
//            if (!(j < flavors.length)) {
//                break;
//            }
//            System.out.println(flavors[j]);
//            j++;
//        }


        String[] toppings = {"M&Ms",
                "Chocolate",
                "Oreos",
                "Kit Kats",
                "Sprinkles",
                "Chocolate Syrup",
                "Caramel",
                "Reese's"};

        for (int i = 0; i < flavors.length; i++) {
            String bowl = flavors[i] + " and ";
            //can nest loops just like if statements
            //will do all iterations of the inner loop, before circling
            //back around to the outer loop
            for (int j = 0; j < toppings.length; j++) {
                //String bowl = flavors[i] + " and " + toppings[j];
                if (j == 0) {
                    bowl += toppings[j];
                } else {
                    bowl += ", " + toppings[j];
                }

                System.out.println(bowl);
            }
        }

    }

    public static void shortercarPrompt(Scanner input) {
        String car = "";

        //while loops do not end in a semi-colon after the condition(;)
        //for loops do not end in a semi-colon after the condition(;)
        //for-each loops do not end in a semi-colon after the condition(;)
        //do-while loops do end in a semi-colon after the condition(;)
        do {
            if (car.trim().equalsIgnoreCase("Volkswagen") ||
                    car.trim().equalsIgnoreCase("Vw")) {
                System.out.println("That brand sucks, pick a better one.");
            }

            System.out.println("Enter a valid car brand: ");
            car = input.nextLine(); //takes user input, also keeps the loop from infinitely repeating
        } while (car.trim().equalsIgnoreCase("Volkswagen") ||
        car.trim().equalsIgnoreCase("Vw") ||
        car.trim().equalsIgnoreCase(""));
        System.out.println("Great choice!");
    }

    public static void carprompt(Scanner input) {

        System.out.println("Enter a car: ");
        String car = input.nextLine();

        //.trim gets rid of any spaces before or after user input
        // || = or
//        while (car.trim().equalsIgnoreCase("Volkswagen") ||
//        car.trim().equalsIgnoreCase("Vw") ||
//        car.trim().equalsIgnoreCase(" ")) {
//            System.out.println("That brand sucks, pick a better one");
//            System.out.print("Enter a car brand: ");
//            car = input.nextLine();
//        }
//
//        System.out.println("Great choice!");
    }

}
