package Week4.D4;

import java.util.Objects;

public class main {


    public static void main(String[] args){


        Circle Circle = new Circle();
        Circle2 Circle2 = new Circle2();


        if (Objects.equals(Circle, Circle2)){
            System.out.println("Both Circles are even");}
            else {
                System.out.println("The Circles are not even");
            }


    }
}
