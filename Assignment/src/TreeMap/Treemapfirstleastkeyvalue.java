package TreeMap;

import java.util.TreeMap;

public class Treemapfirstleastkeyvalue {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Zebra");
        tm.put(2,"Blue");
        tm.put(6,"horse");
        tm.put(9,"Purple");
        tm.put(3,"Yellow");

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
    }
}
