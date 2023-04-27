package Week5.Java;

import Week5.Sedan;
import Week5.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaFoundations2 {

    public static void main(String[] args){
        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2)) System.out.println("true");
        else System.out.println("false");
        staticstuff();
        System.out.println("hello world   a b b b b  b  ".trim());
    }

    public static void linkedList(){

        //two most common types of list are:
        //ArrayList: a Continuous chunk of memory
        //Instant indexed access to elements, generally has more space than you need by 50%
        //Fast inserts at the end, when there's space

        //LinkedList:Has basically the same setup as the heap( basically a LinkedList)
        //elements stored in the LL have to ask each other elements where each other are. Like asking a neighbor for directions to a friends house
        //Slow lookups
        //very fast inserts and deletions
        //only has as much space as it needs
        //all pointers, uses "nodes"
        //Singly Linked List (each node only knows where the next one is)
        //doubly LinkedList: each node knows where the next one is and where the previous one is

        //both are list
        //keep in mind, List is an interface
        List<Sedan> carAL = new ArrayList<>(); //car ArrayList
        List<Sedan> carLL = new LinkedList<>(); //car LinkedList

        carAL.add(new Sedan());
        carAL.add(new Sedan("Black", "Honda", "Civic"));
        carAL.add(new Sedan("Grey", "Toyota", "Corolla"));

        carLL.add(new Sedan());
        carLL.add(new Sedan("Black", "Honda", "Civic"));
        carLL.add(new Sedan("Grey", "Toyota", "Corolla"));

        System.out.println(carAL);
        System.out.println(carLL);

        //LinkedList implements the list methods so we can give it an index
        //but it still traverses every element to get there
        //ArrayList jumps straight to it
        System.out.println(carAL.size());
        System.out.println(carLL.size());

        /*   ArrayList vs. LinkedList
        Array List:
        -instant lookup times(indexed access)
        -slow inserts and deletes
        -Continuous in memory
        -generally have more space than needed

        LinkedList:
        -In java, doubly linked
        -slow lookups(no indexed access)
        -not continuous in memory
        -has exactly the space it needs
        -very fast inserts and deletes
        */
    }

    public static void staticstuff(){

        Vehicle car1 = new Sedan(); //reference to a vehicle
        Sedan car2 = new Sedan("Black", "Honda", "Civic"); //reference to a sedan

        //instance methods look at the underlying type
        car1.honk();
        car2.honk();

        //static methods look at the reference type
        car1.drive();
        car2.driving();
    }
}
