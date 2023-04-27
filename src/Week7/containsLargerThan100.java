package Week7;

import java.util.Arrays;

public class containsLargerThan100 {


    public static void main(String[] args) throws java.lang.Exception {
        int[] bal = new int[]{10,20};
        int [] bal2 = bal;
        bal = new int[] {100};
        System.out.println(bal == bal2);

        int start = 5;
        int end = 10;


        int[] maxArry = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int N = 40;
        int[] arryN = {2,5,6,1,8,42};


        System.out.println(containsLargerThan100(maxArry));
        System.out.println(evenSum(start, end ));
        System.out.println(containsLargerThanN(arryN, N));

    }

    /* 1. taken an array
    2. Check the length of the array, if it's 0 it's false
    3. with this array take the first index
    4. check if it's greater than 100
    5. if it's greater than 100 then return true
    6. if it's not greater than 100 then make new array that's smaller
    7. pass the new instance of array along in variable


     */

    public static boolean containsLargerThan100(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums[0] > 100) {

            return true;
        }

        int[] x = Arrays.copyOfRange(nums, 1, nums.length);

        return containsLargerThan100(x);
    }

    // {2,4,7,8,12};
    public static int evenSum(int start, int end)  {

        //1. Traverse elements of the array and check if the values for variable start/end are divisible by
        // 2 with 0 left over(even) and if it isn't then assign the value of start post-incremented by 1 to make it even

        //2. check if the value of end is operand divisible by 2 and whether and not it is even, if not then post-decrement by 1
        // to get an even number and assign to end

        //3. check if the values for start and end are equal to one another and return the value of start if they are

        //4. recursive call for the method with the current value of start(6) variable added onto the method call with the
        // parameters of start(6) + 2, and the current value of end(10)

        if (end < start ) {
            throw new IllegalArgumentException("Not today AA ron");

        }
        if (start %2 != 0){

            start++;
        }if (end % 2 != 0){

            end --;
        }
        if (start == end){

            return start;
        }
        return start + evenSum(start + 2, end);
    }

    public static boolean containsLargerThanN(int[] nums, int N) {
        if (nums == null || nums.length > N) {
            return false;
        }
        if (nums[0] > N) {

            return true;
        }

        int[] X = Arrays.copyOfRange(nums, 1, nums.length);

        return containsLargerThanN( X, N);
    }
}

