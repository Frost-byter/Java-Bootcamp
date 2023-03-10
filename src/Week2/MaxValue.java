package Week2;

public class MaxValue {



    public static void main(String[] args) {

        maxV();
        personalArray();

    }

    public static void maxV() {
        // create and Initialize an array
        int[] array = { 72, 34, 53, 23, 43, 23, 45, 69, 71, 95, 52, 12, 34, 33, 73,
                40, 50, 20, 99, 71, 24, 53, 24, 53, 29, 40 };

        // creating a variable with matching data type to target array(maxValue)
        // assign variable to array and set equal to the first value in the array
        // using [0] ---> int maxValue = array[0]
        int maxValue = array[0];

           // create a for loop to look through the array and look for largest value
          // set the data type matching the array with variable assigned counter value of 0
         // ---> int(data type) i(counter variable) =(assigning) 0(counter value)
        //----> i < array.length(stating that the loop will continue until conditions are met while
        // parsing through array)
        //i++ --> (increases i by 1 everytime it goes through the loop)
        for(int i = 0; i < array.length; ++i) {
            if(array[i] > maxValue) {

                maxValue = array[i];
            }

            System.out.println("The Max value of the array is:" + maxValue);

        }



    }

    public static void personalArray() {

        int[] nums = {1, 34, 29, 52, 18, 94, 105, 302, 23};

        int pa = nums[0];

        for(int i = 0; i <nums.length; i++) {

            if(nums[i] > pa) {

                pa = nums[i];
            }

            System.out.println("The Max value of the array is:" + pa);


        }

    }






















}
