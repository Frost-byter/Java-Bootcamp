//package Week2;
//
//import java.util.Scanner;
//
//public class Day1 {
//    /* this is a method
//    This method is the entry point every application
//    Methods need to exist inside a class
//     */
//    //anything that stems from main runs, if main does not lead to it, it does not run
//
//    //this method has two parameters
//    public static void printnumbers(double x, int y){
//        //the x and y are local to this method
//        //they only exist within this method
//        System.out.println(x + y);
//
//       // x = 18.5;//notice that java is happy with this
//       // y = 27;
//
//    }
//
//    public static int main(int[] args) {
//        print("Hello World!");
//        //System.out.println("We're calling methods today");
//        //System.out.println("This is a method, this is the print method");
//
//        //to call the method I need the signature and any parameters
//        //print("not the tabs!");
//
//        int x =34;//this is a completely different instance separate from the printnumbers method and can only be called inside the main method
//        double y = 24.2;
//        //in case I want a return later I save it to a variable
//
//        String output = toppingRating();
//
//        System.out.println(output);
//
//        System.out.println(numComparison(7, 10));
//
//        System.out.println(numComparison(longequation(2,3,4.5), longequation(2,4,1.1)));
//
//        //The order of defining/declaring these do not matter
//        //methods can have no parameters
//        public static void doMath() {
//            int num1 = 47;
//            int num2 = 23;
//        }
//
//
//        public static String numComparison(double num1, double num2) {
//
//            //every possible path must return a value
//            if(num1 == num2) {
//                return num1 + "is equal to" + num2;
//            } else if (num1 > num2) {
//                return num1 + "is greater than" + num2;
//            } else {
//                return num1 + "is less than" + num2;
//            }
//        }
//
//
//
//
//        printnumbers(26.5, 12); //this is where I hand it the arguments(user supplied)
//        //---> printnumbers(12, 26.5);// the order of the argument has to match the order of the parameters ex. (double x, int y) <----has to be in this order
//        // Cannot be switched around if that is not the order of the parameters defined in the method
//
//        //
//        longequation(66, 36, 7.7);
//        //If I want to do something with the "return" I need to save it somewhere
//        System.out.println("Method return " + longequation(66, 36, 7.7));
//
//        //different from the result in the method
//        double result = longequation(66, 36, 7.7);
//        System.out.println("Result is: " + result);
//
//    }
//
//
//    //--------------------------------------------------------------------------------------
//public static String toppingsRating() {
//    Scanner in = new Scanner(System.in);
//
//    System.out.print("What topping should I get?: ");
//    String topping = in.nextLine(); //returns a string based on user input
//
//        in.close(); // Java can reach this code without issue, and it doesn't cause any problems being executed here
//
//        // can call any other methods within this method, same as before
//        doMath();
//
//        print("processing your topping.......");
//
//       /* My code must return a string no matter what
//          So I need to make sure I have an "else" or something like that
//          Happens after the "if"*/
//    if (topping.equalsIgnoreCase("pepperoni") ||
//            topping.equalsIgnoreCase("pineapple") ||
//            topping.equalsIgnoreCase("Chicken")) {
//        return "great choice!"; // if this is hit, method ends here
//    } else if (topping.equalsIgnoreCase("Anchovies")) {
//        return "Gross dude"; // if this is hit, method ends here
//    }
//
//    // if none of the above is true, this is returned
//    return "Good choice buddy!";
//
//    //cannot put any code after a return because java will never reach that code
//    /* unreachable code is code that java can't write based on code block organization.
//    Java won't bother trying to save code in memory.
//      */  }
//
//
//    public static double longequation(int a, int b, double c) {
//        double result = 0;
//
//        /* I don't want to retype all of this. So I made it a method signature
//        I can reuse this code as much as I want by calling the method signature, and changing the arguments
//         */
//        double out1 = Math.pow(a, 3) + b * Math.pow(c / b, 2) - a * c;
//        double out2 = a - c * (Math.pow(a, c ) / b) + c;
//        double out3 = Math.pow(b , 3) + a * Math.sqrt(Math.pow(c /b, 2)) - a * c;
//
//        result = (out1 + out2) / out3;
//        /* return keyboard is used to tell a method to give a value back to
//        whatever called this method. The value must match the return type in the method called
//        Anything you plan on using more than once, best practice would be to move it to a method so you can
//        call it whenever needed.
//         */
//
//
//        return result;
//    }
//
//
//    //This method has one parameter
//    public static void print(String message) {
//        //public = accessor/access modifier
//        //static = your modifier
//        //void = return type
//        //print = method name(part of signature)
//        //(string message) = parameter (other part of signature)
//        // {} = method body
//        //the order of your accessor and modifier doesn't matter, you can still run your code
//
//        //methods can call other methods
//        System.out.println(message);
///* your main method is like a First Sergeant, with all other methods i.e. the print method defined above would be the platoon
//under the first sergeant(main method) and the same applies to the printnumbers method
//you then call on them to do a certain job assigned to them via a method and parameters that are defined in the body of a class
//
//ex. public(accessor that defines whether this class can access other files) class(class that's being defined) myclass(name of the class)
//           {--------->this shows ownership of all methods inside of these curly braces
//           public static void main(int x, int y)<--- parameters defining what the method will do
//           -----> Shows ownership{
//
//
//           }
//
//
//           }
//
// */
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//}
