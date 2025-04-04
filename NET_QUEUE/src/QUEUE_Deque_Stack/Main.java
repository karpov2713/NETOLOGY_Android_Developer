package QUEUE_Deque_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Deque - двунаправленная очередь
        Deque<String> q = new LinkedList<>();
        q.offerFirst("Petya");
        System.out.println(q.pollFirst());
        q.offerFirst("Petya");
        System.out.println(q.pollLast());

        // - - - - 1 - - -
        Deque<String> ad = new ArrayDeque<>();

        Stack<String> s = new Stack<>();
        s.push("Petya");
        s.push("Olga");
        s.push("Tanya");
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        System.out.println(s.pop());

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

        for (String name : s){
            System.out.println(name);
        }



    }
}
