package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Treemapdeleteall {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Red");
        tm.put(2,"Blue");
        tm.put(3,"Yellow");


        tm.clear();

        for (Map.Entry<Integer,String> s:tm.entrySet())
            System.out.println(s.getKey());

    }
}
