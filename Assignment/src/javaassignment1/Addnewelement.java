package javaassignment1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Addnewelement {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();
        System.out.println("Enter the color you want to add");
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        p1.add(color);
        System.out.println(p1);
     }
}
