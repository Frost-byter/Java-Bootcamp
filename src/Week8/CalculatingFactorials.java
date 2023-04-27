package Week8;

public class CalculatingFactorials {

    public static void main(String[] args){

        System.out.println(factorial(3));
        crazyLoop();
    }

    public static long factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorial Undefined for negatives.");
        } if (n == 0) {

            return 1;
        }
        return n * factorial (n-1);
    }

    static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL:
            System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
}



