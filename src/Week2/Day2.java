package Week2;

public class Day2 {

    public static void main(String[] args){
        System.out.println("Day2, All about overloading");


        //calls to different methods with the same name
        System.out.println(getCookie(40));
        System.out.println(getCookie());
        System.out.println(getCookie(40.0));
        System.out.println(getCookie(6, "Snicker doodle"));
        System.out.println("You get " + getCookie("Oatmeal") + "Cookies");
        System.out.println("You get " + getCookie("M & M") + "Cookies");
        System.out.println("You get " + getCookie("Macadamia Nut") + "Cookies");
        System.out.println(getCookie(getCookie("Chocolate chip"), getCookie("Salted Caramel")));
        System.out.println(getCookie(getCookie("Sugar"), 2.75));

        //We've eaten 96 cookies so far.....that they know of
        //We round down because less to run
        System.out.println("You ran " + Math.floor(getCookie(0.5, 96)) + " miles to work off those cookies");
    }

        //method overloading
        //Overloading =
        //Two methods with the same name and a different number, type, or parameters

        public static String getCookie() {
            return "Chocolate Chips";
        }
        public static String getCookie(int num){
         return "Chocolate Chips x" + num;
        }
        public static String getCookie(int num, String type){
            return type + "cookies x" + num;
        }
        public static String getCookie(int num, int num2) {
            return "You ate" + (num + num2) + "cookies!";
        }

        public static String getCookie(int num1, double num2) {
            double tax = 0.06;
            double price = (num1 * num2) * (1 + tax);

            return String.format("You ate %d cookies at $%.2f price for a total of $%.2f%n",
                    num1, num2, price);
            //%d(percent D) = Needs a whole number method, tells java that the spot it's in is for a whole number(placeholder)
            //% = escape characters for formatting $%.2f =format this code going as far as 2 decimal values as a float
            // String format
        }
        public static double getCookie(double distance, int cookies) {
            return distance * cookies + distance / (cookies / 4);
            //distance = distance per cookie
            //cookie = cookies eaten.....that you know of
        }

        public static String getCookie(double num)
        {
            return "Sharing " + num + " Sugar cookies";
            //return "Chocolate chip x" + num;

        }
         //can change the return type with an overload
        public static int getCookie(String type) {
            if (type.equalsIgnoreCase("Chocolate Chip") ||
                    type.equalsIgnoreCase("Sugar")) {
                return 42;
            } else if (type.equalsIgnoreCase("Oatmeal")){
                return 23;
            } else if (type.equalsIgnoreCase("Peanut Butter Chocolate Chip") ||
                    type.equalsIgnoreCase("Raisin")) {
                return 7;
            } else {
                return 12;
            }

        }




}


