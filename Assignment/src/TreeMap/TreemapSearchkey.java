package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapSearchkey {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Red");
        tm.put(2,"Blue");
        tm.put(3,"Yellow");



        for(Map.Entry<Integer,String> s:tm.entrySet()){
            if(s.getKey()==2)
                System.out.println("Found the key "+s.getKey()+" "+s.getValue() );
        }
    }
}
