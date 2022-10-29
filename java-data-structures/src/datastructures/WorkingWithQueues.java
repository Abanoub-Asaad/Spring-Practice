package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String [] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Abanoub", 22));
        queue.add(new Person("Ali", 12));
        queue.add(new Person("John", 10));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    static record Person(String name, int age) { }
}
