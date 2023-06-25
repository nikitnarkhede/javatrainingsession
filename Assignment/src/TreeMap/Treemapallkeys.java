package TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemapallkeys {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Zebra");
        tm.put(2,"Blue");
        tm.put(3,"Yellow");



        for(Map.Entry<Integer,String> s:tm.entrySet()){
            System.out.println(s.getKey());
        }
        Set<Integer> s = tm.keySet();
    }
}
