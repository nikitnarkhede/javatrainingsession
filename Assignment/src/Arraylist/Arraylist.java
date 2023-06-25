package Arraylist;

import Assignment2.Order;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        ArrayList al1 = new ArrayList<String>();
        al.add("red");
        al.add("blue");
        al.add("pink");
        al.add("cyan");

        al1.add("aaa");
        al1.add("bbb");

        for(String s: al)
            System.out.println(s);

        al.add(0,"lily");
        System.out.println(al.get(0));
        al.set(1,"orange");
        al.remove(1);
        al.contains("pink");
        Collections.sort(al);

        Collections.copy(al,al1);
        Collections.shuffle(al);
        Collections.reverse(al);

        System.out.println(al.subList(2,4));
        Collections.swap(al,3,2);
        al.addAll(al1);


    if(al1.isEmpty())
    {
        System.out.println("Array List is empty");
    }
        al.trimToSize();
    al.ensureCapacity(20);
    al.set(1,"String");
    for(int i =0 ; i<al.size();i++)
    {
        System.out.println(al.get(i));
    }
    Collections.sort(al,new Sort());
    System.out.println(al);
    }
}
class Sort implements Comparator<String> {

    // Method
    // Sorting in ascending order of name
    public int compare(String a, String b)
    {

        return a.compareTo(b);
    }
}
