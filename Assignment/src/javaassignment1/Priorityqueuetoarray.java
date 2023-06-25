package javaassignment1;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Priorityqueuetoarray {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();

        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");
        Object a1[] = p1.toArray();

        for(Object s:a1){
            System.out.println(s);
        }
    }
}
