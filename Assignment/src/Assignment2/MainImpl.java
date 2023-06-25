package Assignment2;

import javax.naming.InsufficientResourcesException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MainImpl {
    public static void main(String[] args) {
        List<Product> ProductList = new ArrayList<>();
        Product p = new Product(1, "POP", "Books", 101.00);
        Product p1 = new Product(2, "POP1", "Books", 99.00);
        Product p2 = new Product(3, "Thermostat", "Device", 102.00);
        Product p3 = new Product(4, "CPP", "Books", 104.00);

        ProductList.add(p);
        ProductList.add(p1);
        ProductList.add(p2);
        ProductList.add(p3);

//Exercise 1
        for (Product pl : ProductList) {
            if (pl.getCategory().equalsIgnoreCase("BOOKS") && pl.getPrice() > 100.00) {
                System.out.println(pl.getName());
            }
        }
        Set<Product> ProductList1 = new HashSet<>();
        Product op = new Product(1, "POP", "Baby", 101.00);
        Product op1 = new Product(2, "POP1", "Books", 99.00);
        Product op2 = new Product(3, "Thermostat", "Device", 102.00);
        Product op3 = new Product(4, "CPP", "Baby", 104.00);
        ProductList1.add(op);
        ProductList1.add(op1);
        ProductList1.add(op2);
        ProductList1.add(op3);

        Order o = new Order(1, LocalDate.parse("2021-02-02"), LocalDate.parse("2022-04-02"), "Placed", new Customer(1, "Lepro", 2), ProductList1);
        Order o2 = new Order(3, LocalDate.parse("2021-02-15"), LocalDate.parse("2022-04-02"), "Placed", new Customer(1, "Akash", 2), ProductList1);
        Order o3 = new Order(4, LocalDate.parse("2020-12-01"), LocalDate.parse("2022-04-02"), "Placed", new Customer(1, "Nikit", 3), ProductList1);
        Order o1 = new Order(2, LocalDate.parse("2021-02-16"), LocalDate.parse("2022-04-02"), "Placed", new Customer(1, "Nikit", 3), ProductList1);


        List<Order> ol = new ArrayList<>();
        ol.add(o);
        ol.add(o1);
        ol.add(o2);
        ol.add(o3);
        //Exercise 6
        for (Order or : ol) {
            if (or.getOrderDate().isEqual(LocalDate.of(2021, 03, 15)))
                System.out.println(or.toString());


        }
        //Exercise 2
        for (Product pll : o.getProducts()) {
            if (pll.getCategory().equalsIgnoreCase("Baby")) {
                System.out.println(pll.getCategory());
            }
        }

        //Exercise 3
        List<Product> ProductList2 = new ArrayList<>();
        Product tp = new Product(1, "Nerf", "Toys", 101.00);
        Product tp1 = new Product(2, "POP1", "Books", 99.00);
        Product tp2 = new Product(3, "BeyBlade", "Toys", 102.00);
        Product tp3 = new Product(4, "CPP", "Books", 104.00);

        ProductList2.add(tp);
        ProductList2.add(tp1);
        ProductList2.add(tp2);
        ProductList2.add(tp3);
        Double toysSum = 0.00;
        for (Product pl : ProductList2) {
            if (pl.getCategory().equalsIgnoreCase("TOYS")) {
                System.out.println(pl.getName());
                toysSum = toysSum + pl.getPrice();
            }
        }
        System.out.println("Toys are discounted 10% " + (toysSum / 100) * 90);

        //Exercise 4

        for (Order or : ol) {
            System.out.println("***************************************");
            if (or.getCustomer().getTier() == 2 && (or.getOrderDate().isAfter(LocalDate.of(2021, 02, 01)) && or.getOrderDate().isBefore(LocalDate.of(2021, 04, 01)))) {
                for (Product pll : or.getProducts()) {
                    System.out.println(pll.getCategory());
                }
            }
        }
        Double price = 0.00;
        for (Product pl : ProductList) {
            if (pl.getCategory().equalsIgnoreCase("BOOKS")) {
                price = pl.getPrice();
            }
        }
        Long id = 0L;
        List<Product> book = new ArrayList<>();
        for (Product p9 : ProductList) {
            if (p9.getCategory().equalsIgnoreCase("BOOKS"))
                if (price > p9.getPrice()) {
                    price = p9.getPrice();
                    id = p9.getId();
                }
        }
        for (Product pl : ProductList) {
            if (pl.getId() == id) {
                System.out.println("Cheapest books " + pl.getName());
            }
        }
        Collections.sort(ol, new Sort()
        );
        System.out.println(ol.size());
        for (Order or : ol) {

            System.out.println(or.getOrderDate());


        }
        double febSum = 0;
        System.out.println("---------------------------------");
        LocalDate date = LocalDate.of(2020, 02, 8);
        for (Order or : ol) {
            if ((or.getOrderDate().getMonth()) == date.getMonth())
                for (Product oo : or.getProducts()) {
                    febSum = febSum + oo.getPrice();
                }


        }
        System.out.println("Sum of price of Feb " + febSum);


        for (Order or : ol) {
            if ((or.getOrderDate()) == LocalDate.of(2021, 03, 14))
                for (Product oo : or.getProducts()) {
                    febSum = febSum + oo.getPrice();
                }


        }
        System.out.println(febSum / ol.size());
        Map<Integer, Integer> m = new HashMap<>();
        for (Order mapo : ol)
            m.put(mapo.getId(), mapo.getProducts().size());


        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }




        Map<String, Integer> m1 = new HashMap<>();

        for(int i=0;i<ol.size();i++){
            System.out.println(ol);
        }
        int cn=0;

        for (Order mapo1 : ol) {
            cn=0;
            if (m1.get(mapo1.getCustomer().getName()) == null){

                for (Order mapo2 : ol) {

                    if (mapo2.getCustomer().getName() == mapo1.getCustomer().getName()) {

                        cn = cn + 1;
                    }
                }

                }

            if(m1.get(mapo1.getCustomer().getName())==null)

                System.out.println(mapo1.getCustomer().getName() + " "+cn);
            m1.put(mapo1.getCustomer().getName(), cn);

        }

        double orderPrice = 0;
        Map<Integer, Double> m3 = new HashMap<>();
        for (Order mapo3 : ol) {
            for (Product p5 : mapo3.getProducts()) {
                orderPrice = orderPrice + p5.getPrice();

            }
            m3.put(mapo3.getId(), orderPrice);
            orderPrice = 0;
        }

        for (Map.Entry<Integer, Double> entry : m3.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



        Map<String, Set<String>> m4 = new HashMap<>();

        for(int i=0;i<ol.size();i++){
            System.out.println(ol);
        }


        Set<String> s = new HashSet<>();
            for (Product p6 : ProductList1) {
                s.clear();
                if(m4.get(p6.getCategory())==null) {

                    for (Product p7 : ProductList1) {
                        if (p6.getCategory() == p7.getCategory()) {

                            s.add(p7.getName());

                        }
                    }
                    System.out.println(s);
                    m4.put(p6.getCategory(), s);
                }

            }

            for(int i=0;i<m4.size();i++)
                System.out.println(m4.get(i));
        Collections.sort(ProductList, new Sortprice());

        System.out.println(ProductList.size());
        Double catprice=0D;
        Map<String,Double> sd = new HashMap<>();
        for (Product p6 : ProductList) {
            s.clear();
            if(sd.get(p6.getCategory())==null) {

                for (Product p7 : ProductList) {
                    if (p6.getCategory() == p7.getCategory() && catprice<p7.getPrice()) {

                        sd.put(p7.getCategory(),p7.getPrice());

                    }
                }

            }



        }
        System.out.println(sd.size());
        for (Map.Entry<String, Double> entry : sd.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

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

class Sortprice implements Comparator<Product> {

    // Method
    // Sorting in ascending order of name
    public int compare(Product a, Product b)
    {

        return a.getPrice().compareTo(b.getPrice());
    }
}

