package javaassignment1;

import java.util.PriorityQueue;

public class Addingpriorityqueue {
    public static void main(String args[]){

        PriorityQueue<String> p1 = new PriorityQueue<>();
        PriorityQueue<String> p2 = new PriorityQueue<>();
        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");

        //printing original queue
        for (String c : p1) {
            System.out.println(c);
        }
        //adding all element of p1 to p2
        p2.addAll(p1);
        for (String c1 : p2) {
            System.out.println(c1);
        }
    }
}
