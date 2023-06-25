package HashMapassign;

import Assignment2.Order;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class Hashmapcreate {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Apple");
        hm.put(2,"Banana");
        hm.put(3,"Catapult");
        hm.put(4,"Dog");
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        hm1.putAll(hm);
        System.out.println(hm.size());
        System.out.println(hm1);
        hm1.clear();
        System.out.println(hm1);
        if(hm1.isEmpty()){
            System.out.println("Hash Map is Empty");
        }
        hm1 =(HashMap) hm.clone();
        System.out.println(hm.containsKey(2));
        Object s = hm.entrySet();
        System.out.println(s);
        System.out.println(hm.get(2));
        Object s1 = hm.keySet();
        System.out.println(s1);
        System.out.println(hm.values());

    }
}
class Sort implements Comparator<Order> {

    // Method
    // Sorting in ascending order of name
    public int compare(Order a, Order b)
    {

        return a.orderDate.compareTo(b.orderDate);
    }
}
