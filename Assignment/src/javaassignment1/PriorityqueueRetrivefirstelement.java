package javaassignment1;

import java.util.PriorityQueue;

public class PriorityqueueRetrivefirstelement {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();

        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");


        System.out.println(p1.peek());
    }
}
