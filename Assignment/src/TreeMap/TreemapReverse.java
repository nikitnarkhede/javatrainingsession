package TreeMap;

import java.util.Collections;
import java.util.TreeMap;

public class TreemapReverse {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(Collections.reverseOrder());
        tm.put(1,"Zebra");
        tm.put(2,"Blue");
        tm.put(6,"horse");
        tm.put(9,"Purple");
        tm.put(3,"Yellow");

        System.out.println(tm);


        System.out.println(tm.descendingKeySet());
    }
}
