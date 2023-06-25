package javaassignment1;

import java.util.PriorityQueue;

public class Priorityqueueretrivedeletefirstelement {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();

        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");


        p1.remove(p1.peek());
        for(String s: p1){
            System.out.println(s);
        }
    }
}
