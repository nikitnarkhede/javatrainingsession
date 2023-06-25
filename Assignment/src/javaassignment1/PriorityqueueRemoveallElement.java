package javaassignment1;

import java.util.PriorityQueue;

public class PriorityqueueRemoveallElement {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");

        for (String c : p1) {
            System.out.println(c);
        }

        p1.removeAll(p1);
        if(p1.isEmpty()){
            System.out.println("Priority Queue is empty");
        }
    }
}
