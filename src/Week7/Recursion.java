package Week7;
// Recursion
//Recursion - Anytime a method calls itself
//important consideration, if a method calls itself it never ends
public class Recursion {

    //this is a stack overflow error
    public void recursion(){
        System.out.println("In the method");
        recursion();//java doesn't say this is an error

        //this line is unreachable
        System.out.println("That was great");
    }

    //recursive methods need a return for them to work properly
    //this return/ condition is called a "base case"
    //recursion is for taking a large problem and breaking it up until it doesn't make sense
    //to break it up any further, that point is your base case

    //recursion is avoided because it is very memory intensive
    //very error prone

    //anything you can do with recursion, you can do with a loop

    public int sum(int x){
        //we want to return the sum of every number from 0-x
        if (x == 0) {//this is for our base case
            return 0;
        }

        //we need a return, but also a condition that tells us when a problem
        //is too small to break up further
        return x + sum(x - 1);
    }

    //big recursive algorithm is fibonnaci sequence
    //fibonnaci is the summation of the previous two numbers
    //1 1 2 3 5 7 12....

    public int iterativeSum(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += i;
        }
        return sum;
    }

    public int fibonnaci(int n){
        if (n <= 1){
            return n; //will be either 0 or 1 at this point
        }
        //recursive call
        //return the sum of the two proceeding numbers
        return fibonnaci(n -1) + fibonnaci(n -2);
    }

    public int iterativeFibonnaci(int n){
        int fib = 0;// the number we wnna return
        int num1 = 0, num2 = 1; //previous two values

        if (n == 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        } for (int i = 2; i < n; i++){
            fib = num1 + num2; //fib - the previous two numbers added together

            //update numbers
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }

}
