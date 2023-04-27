package Week6;
//generics:
//they are a placeholder
//generics can be any class, but not a primitive
public class MyLinkedList<T> { // <> tells java that this is a generic
    //generally denoted by
    //T - type
    //E - Elements
    // K - Keys
    // N - Numbers
    // V - Value

    // can use any of the above to denoted a generic, the letter used does not matter

    //rough implementation of a singly LinkedList
    private Node head;
    private int size;

    //inner class, only useable within MyLinkedList
    //because it's only useable by MyLinkedList, there isn't a reason to use getters and setters
    private class Node{

//        private Node next; //each node knows where the next one in the chain is
//        Private T data; //each node knows what it's data is
//
//        public Node(T t){
//            next = null;
//            data = t;
//        }



    }
}
