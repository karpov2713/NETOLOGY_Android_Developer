package QUEUE_LinkedList_PrioretyQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Petya");
        queue.offer("Olga");
        queue.offer("Tanya");
        queue.offer("Dima");

        queue.remove("Olga");

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }
    }
}