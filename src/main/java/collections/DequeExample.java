package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> process = new ArrayDeque<>(); //Deque is an interface.
        process.push("process 1");
        process.push("process 2");
        process.push("process 3");

        System.out.println(process);
        process.add("process 4"); // .add() adds an element at the end of the queue
        process.push("process 5");
        System.out.println(process);

        System.out.println(process.pop());
        System.out.println(process.pop());
        System.out.println(process.pop());
        System.out.println(process.pop());
        System.out.println(process.pop()); //pop and poll does the same thing
        System.out.println(process);
        System.out.println(process.poll());
        System.out.println(process.poll());
        System.out.println(process.poll());
        System.out.println(process.poll());
        System.out.println(process.poll());
        System.out.println(process);

    }
}
