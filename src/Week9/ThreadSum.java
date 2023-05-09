package Week9;

public class ThreadSum extends Thread{

    /*make an application with one class that extends thread/runnable
    *
    * override the run method
    * make two threads,
    * sum every number between start and end
    * one thread sums the even numbers
    * one thread sums the odd numbers
    * combine the results both threads came up with to get the final sum */

    private int start;

    private int end;

    private static boolean isEven;

    private static boolean isOdd;

    private int sum;

    public static void main(String[] args) throws InterruptedException{
    int start = 1;
    int end =10;


    ThreadSum evenSum = new  ThreadSum(start, end, isEven);


    ThreadSum oddSum = new ThreadSum(start + 1, end, isOdd);


    Thread evenThread = new Thread(evenSum);


    Thread oddThread = new Thread(oddSum);


    evenThread.start();


    oddThread.start();


    evenThread.join();


    oddThread.join();


    int totalSum = evenSum.getSum() + oddSum.getSum();
        System.out.println("Total: " + totalSum);
}

    public ThreadSum(int start, int end, boolean isEven){

        this.start = start;
        this.end = end;
        this.isEven = isEven;
        this.sum = 0;
    }

    @Override
    public void run(){

        for (int i = start; i <= end; i++) {

            if(isEven && i % 2 == 0){

                sum += i;
            } else if (!isEven && i % 2 != 0){
                sum += i;
            }
        }

    }
    public int getSum(){
        return sum;
    }
}
