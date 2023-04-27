package Week7;

public class sorting {

    //has to recheck the array multiple times

    public void insertionSort(int[] arr){
        int length = arr.length;

        //you search a value and everything below that value
        for(int i = 1; i < length; i++){
            int value = arr[i];//the value we are comparing
            int j = i - 1; // the index we are comparing value to

            System.out.println("Loop: " + i + ", Checking " + value);
            while (j >= 0 && arr[j] > value){
                //while we are still in a valid index and our value is less than
                //j - 1, we shift j -1 over to j(one space)

                arr[j + 1] = arr[j];
                j--;
                System.out.println("Against " + arr[j] + " ->");
                print(arr);
            }
            // j is now either -1 or is less than value
            arr[j + 1] = value;//we went too far, go back and place value here
            print(arr);
        }
    }
    public void bubblesort(int[] arr){
        //each number bubbles up until it's at the correct spot
        int length = arr.length;

        // need to stop before the end of the array because we are comparing our value
        //with the next one, can't compare with null

        for(int i = 0; i < length - 1; i++){
            // need to keep track of the index of the value we're comparing
            //we start from 0 on every loop
            // the end half of the array will always be sorted during the bubbling
            //so we don't check it

            System.out.print("Loop: " + (i + 1) + "\n");
            for (int j = 0; j < length - i - 1; j++){
                System.out.print("Checking: " + arr[j] + " -->");
                if (arr[j] > arr[j + 1]){
                    //swap elements for reference later
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = temp;
                }
            }
        }

        print(arr);
    }

    //arrays don't have a nice toString
    public void print(int[] arr){

        System.out.println("[ ");
        for (int val : arr){
            System.out.println(val + " ");
        }
        System.out.println(" ]");
    }
}

//    public class static Stack<T extends Number> {
//    public void stackPush(java.util.Stack<Integer> stack){
//
//        for(int i = 0; i <5; i++){
//
//            stack.push(i);
//        }
//    }
//
//    public void stackPop(java.util.Stack<Integer> stack){
//
//        for( int i = 0; i < 5; i++){
//            Integer y = (Integer) stack.pop();
//
//            System.out.println("Poppin and lockin: " + y);
//        }
//    }
//
//    public void stackPeek(java.util.Stack<Integer> stack){
//
//        Integer lment = (Integer) stack.peek();
//        System.out.println("Top Element: " + lment);
//    }
//
//    public void stacksize(java.util.Stack<Integer> stack){
//
//        Integer size = (Integer) stack.size();
//        System.out.println("Element size: " + size);
//    }
//}
