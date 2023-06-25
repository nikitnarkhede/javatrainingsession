package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Treemapcopy {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Red");
        tm.put(2,"Blue");
        tm.put(3,"Yellow");


        TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>();

        tm1.putAll(tm);
        for(Map.Entry<Integer,String> s:tm1.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue() );
        }
    }
}
