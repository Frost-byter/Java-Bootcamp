package Week2;

import java.util.Scanner;

public class Day3_Arrays {

    public static void main(String[] args) {
        //arrays are a collection of anything
        //all items need to have the same data type



        //can define an array with an array literal-[]
        //intiliazes the array and declares it
        String[] cookies = {"Chocolate Chip", "Oatmeal", "Sugar", "Snickerdoodle"};

        System.out.println(cookies.length);
        System.out.println(cookies); //cannot print the array like this
        //Just prints the memory location

        System.out.println(cookies.toString());//also not helpful

        System.out.println(cookies[0]);
        System.out.println(cookies[1]);
        System.out.println(cookies[2]);
        System.out.println(cookies[3]);

        //declares and intializes the array
        //default value is "null"
        String[] cars = new String[5];
        System.out.println(cars[0]); //no value yet, default value null
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);

        cars[0] = "BMW 335i";
        cars[1] = "Nissan Altima";
        cars[2] = "VW Rabbit";
        cars[3] = "Ford Festiva";
        cars[4] = "Tesla Plaid";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);

        int nums[]; //declares an array, can move the square bracket anywhere on the left hand side and code will still run

        //nums[0] = 27;/ Can't do this because it hasn't been initialized yet

        //initializes the array
        nums = new int[] {23, 7, 13, 4, 15, 67, 42, 72, 45, 81};
        int a = nums[4];
        int b = nums[5];
        int c = nums[7];

        //A,
        System.out.print(nums[4]);
        System.out.print(nums[5]);
        System.out.print(nums[7]);

        //a, b, and c will be unchanged
        System.out.print(a);
        System.out.println(b);
        System.out.println(c);

        //.length has no () because it is a property, and not a method
        System.out.println(nums.length);

        String name = "Drew";
        System.out.println(name.length());

        char[] name2 = {'D', 'R', 'E', 'W'};
        //or
        char[] name3 = name.toCharArray(); //Strings can easily be converted to char arrays, they are char types

        System.out.println(name3[0]);
        System.out.println(name3[1]);
        System.out.println(name3[2]);
        System.out.println(name3[3]);


        String firstName = new String(name3);
        System.out.println(firstName);

        String[] myCars = getGarageSpace();

        System.out.println(myCars.length);

        System.out.println("First 3 = " + count3(nums));


        int[] numArray1 = {1, 2, 3};
        int[] numArray2 = numArray1;

        System.out.println("****** Number arrays *******");
        System.out.println("NumArray1: ");




    }

    public static int count3(int[] nums) {
        int result = 0;
        result = result + nums[0];// 0 + 23
        result = result + nums[1];// 23 + 7
        result = result + nums[2];// 30 + 17

        return result;
    }

    //can return string arrays from methods, I can return any valid type from a method
    //or void if it returns nothing
    public static String[] getGarageSpace() {
        String[] garage; //declared but not initialized
        Scanner in = new Scanner(System.in);

        System.out.println("How many cars do you have?: ");
        int current = in.nextInt(); //read in the number of cars

        in.nextLine(); //clears the buffer

        System.out.println("How many cars do you want?: ");
        int desired = in.nextInt(); //read in the number of cars
        in.nextLine(); // clears the buffer

        System.out.println("Searching.....");
        System.out.println("You're lucky, I got just the thing for you");

            in.close();
        garage = new String[desired]; //initializes garage to be what the user enters

        return garage;

    }
}
