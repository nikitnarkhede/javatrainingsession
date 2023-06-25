package hashset;

import java.util.*;

public class Hashsetcreate {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        for(Integer i:hs)
            System.out.println(i);

        System.out.println(hs.size());
        if(hs.isEmpty())
            System.out.println("Hash Set is Empty");

        Object hs2 = hs.clone();
        Object hs3array = hs.toArray();


        hs1.removeAll(hs);

        ArrayList<Integer> as = new ArrayList<>(hs);
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
