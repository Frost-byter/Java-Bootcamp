package Week8;

import java.util.Stack;



public class CreatingAStack<T>{


    public static void main(String[] args){

    Stack<String> Stack = new Stack<>();

    Stack.push("Galaga");
    Stack.push("Kirby");
    Stack.push("Sonic Heroes");

        System.out.println(Stack.size());

        System.out.println(Stack);

        Stack.pop();

        System.out.println(Stack.pop());

        Stack.peek();

        System.out.println(Stack.peek());

        Stack.isEmpty();

        System.out.println(Stack.isEmpty());

        Stack.size();

        System.out.println(Stack.size());
    }




}
