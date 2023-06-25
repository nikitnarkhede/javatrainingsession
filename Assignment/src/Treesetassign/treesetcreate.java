package Treesetassign;

import Assignment2.Order;

import java.util.*;

public class treesetcreate {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        TreeSet<String> ts1 = new TreeSet<>();
        ts.add("blue");
        ts.add("green");
        ts.add("red");
        ts.add("cyan");
        ts.add("pink");
        System.out.println(ts);
        for(String s:ts)
        {
            System.out.println(s);
        }
        ts1.addAll(ts);
        Iterator it = ts.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(ts.first());
        System.out.println(ts.last());

        Object ts2 = ts.clone();
        System.out.println(ts.size());

        System.out.println(ts);


        System.out.println(ts.headSet("green"));
        System.out.println(ts.ceiling("green"));
        System.out.println(ts.floor("green"));
        System.out.println(ts.higher("green"));
        System.out.println(ts.lower("green"));
        System.out.println(ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());
        System.out.println(ts);

        System.out.println(ts.remove("red"));
        ArrayList<String> as = new ArrayList<>(ts1);
        Collections.sort(as,new Sort());
        System.out.println(as);

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
