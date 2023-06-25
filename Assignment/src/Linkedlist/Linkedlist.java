package Linkedlist;

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll1.add(000);
        ll1.add(001);
        for(Integer i: ll)
            System.out.println(i);

        System.out.println("...................................");
        Iterator p = ll.listIterator(3);
        Iterator p1 = ll.descendingIterator();

        // print list from second position
        while (p.hasNext())
            System.out.println(p.next());

        System.out.println("...................................");

        while (p1.hasNext())
            System.out.println(p1.next());

        ll.set(2,8);
        ll.addLast(90);
        ll.addFirst(44);

        ll.add(0,22);
        ll.addLast(99);
        System.out.println("------------------------------");
        for(Integer i: ll)
            System.out.println(i);

        ll.addAll(ll1);

        System.out.println(ll.get(0));
        System.out.println(ll.getLast());
        int i=0;
        for(Integer j: ll) {

            System.out.println("Index " + i + " Value "+j);
            i = i + 1;
        }

        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();

        ll1.clear();

        Collections.swap(ll,0,1);

        Collections.shuffle(ll);
        ll1.add(9999);
        ll1.add(9998);

        ll.addAll(ll1);

        ll2 = (LinkedList<Integer>) ll.clone();

        int first = ll.pop();

        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());

        if(ll.contains(99)){
            System.out.println("99 is there in linkedlist");
        }

        Object[] a = ll.toArray();

        if(ll.isEmpty()){
            System.out.println("Linked list is empty");
        }
        ll.set(4,8888);
        ArrayList<Integer> as = new ArrayList<>(ll);
        Collections.sort(as,new Sort());
        System.out.println(as);

    }
}
class Sort implements Comparator<Integer> {

    // Method
    // Sorting in ascending order of name
    public int compare(Integer a, Integer b)
    {

        return a.compareTo(b);
    }
}
