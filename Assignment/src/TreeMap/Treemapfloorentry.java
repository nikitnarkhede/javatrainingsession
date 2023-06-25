package TreeMap;

import java.util.Collections;
import java.util.TreeMap;

public class Treemapfloorentry {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
        tm.put(1, "Zebra");
        tm.put(2, "Blue");
        tm.put(6, "horse");
        tm.put(9, "Purple");
        tm.put(3, "Yellow");
        System.out.println(tm);
        System.out.println(tm.subMap(3,7));
        System.out.println(tm.ceilingEntry(3));
        System.out.println(tm.ceilingKey(2));
        System.out.println(tm.subMap(3,true,7,true));
        System.out.println(tm.tailMap(20));
        System.out.println(tm.floorEntry(8));
        System.out.println(tm.floorKey(8));
        System.out.println(tm.headMap(8));
        System.out.println(tm.headMap(3,true));
        System.out.println(tm.higherEntry(3));
        System.out.println(tm.higherKey(3));
        System.out.println(tm.lowerEntry(3));
        System.out.println(tm.navigableKeySet());
        System.out.println(tm.pollFirstEntry());
        Object i = tm.firstKey();
        tm.remove(i);
        System.out.println(tm);
        System.out.println(tm.pollLastEntry());
        Object l = tm.lastKey();
        tm.remove(l);
        System.out.println(tm);
    }
}
