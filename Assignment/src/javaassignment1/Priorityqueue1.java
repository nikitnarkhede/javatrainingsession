package javaassignment1;

import java.util.PriorityQueue;
//Similar to 2nd assignment

public class Priorityqueue1 {
    public static void main(String args[]) {
        PriorityQueue<String> color = new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        color.add("red");
        color.add("yellow");
        color.add("pink");

        for (String p : color) {
            System.out.println(p);
        }
    }
}