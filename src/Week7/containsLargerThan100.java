package Week7;

public class RecursionAssignment {

    public static void main (String[] args) {
        int[] maxArry = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120};
        System.out.print(RecursionAssignment(maxArry, 0));
        
    }

        public static int RecursionAssignment ( int[] maxArry, int arryX){
            if (arryX == maxArry.length) {
                return 0;
            }
            int max = maxArry[arryX];
            int rmax = RecursionAssignment(maxArry, arryX + 1);
            if (rmax > max) {

                max = rmax;
            }
            return max;
        }

        public static int sum(int n){

            if(n == 0){
                return 0;
            }

            return n + sum(n - 1);
        }
}
