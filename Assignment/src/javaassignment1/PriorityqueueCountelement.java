package javaassignment1;

import java.util.PriorityQueue;

public class PriorityqueueCountelement {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();

        p1.add("Red");
        p1.add("Yellow");
        p1.add("Green");

        //printing original queue
        int cnt = 0;
        for (String c : p1) {
            cnt = cnt + 1;
            System.out.println(c);
        }



        System.out.println(cnt);
    }
}
