package practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonImpl {
    public static void main(String[] args) {
        Person p1 = new Person("Nikit",1);
        Person p2 = new Person("Akash",2);
        Person p3 = new Person("KKKK",3);
        Person p4 = new Person("tttt",20);
        Person p5 = new Person("yyyy",19);
        Person p6 = new Person("yyyy",5);
        Person p7 = new Person("Bheem",9);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
        plist.add(p5);
        plist.add(p6);
        plist.add(p7);


        List<Person> plist1 = new ArrayList<>();
        plist1.add(p1);
        plist1.add(p2);
        plist1.add(p3);
        plist1.add(p4);
        plist1.add(p5);
        plist1.add(p6);
List<List<Person>> p= new ArrayList<>();
p.add(plist);
p.add(plist1);
        StringBuilder s = new StringBuilder();
        for(int i =0; i<plist.size();i++){

            s.append(plist.get(i).getName());
            if(i == plist.size()-1){break;}
            else{s.append(",");}
        }
        System.out.println(s);

        ArrayList<StringBuilder> Name = plist.stream()

                .filter(p99 -> p99.getAge()>18)
                .collect(() -> new ArrayList<StringBuilder>(),
                        (list, element) -> list.add(new StringBuilder(("Mr." + element.getName().toString()))),
                        (list1, list2) -> list1.addAll(list2));

        System.out.println("Assign2------------------------"+Name);

        List<String> Name1 = plist.stream().map(pp1 -> pp1.getName()).skip(2).sorted().collect(Collectors.toList());
        System.out.println(Name1);

        List<Person> Name2 = p.stream().flatMap(pl2 -> pl2.stream()).collect(Collectors.toList());
        System.out.println(Name2);



        List<String> listA = plist.stream().map(pname -> pname.getName().toUpperCase()).filter(pname -> pname.startsWith("A") || pname.startsWith("B")).collect(Collectors.toList()) ;
        System.out.println("Assign1------------------------"+listA);

        Optional<String> olist = plist.stream()
                .map(pname -> pname.getName().toUpperCase())
                .filter(pname -> pname.startsWith("A")).findAny() ;
        System.out.println(olist);

        olist = plist.stream()
                .map(pname -> pname.getName().toUpperCase())
                .filter(pname -> pname.startsWith("Z")).findAny() ;
        System.out.println(olist);

        Optional<String> olist1 = plist.stream().map(pname -> pname.getName()).filter(pname -> pname.startsWith("A")).findFirst();
        System.out.println(olist1);


        olist1 = plist.stream().map(pname -> pname.getName()).filter(pname -> pname.startsWith("Z")).findFirst();
        System.out.println(olist1);


        boolean olist2 = plist.stream()
                .anyMatch(pn -> pn.getAge()==2);
        System.out.println(olist2);

        boolean olist3 = plist.stream()
                .allMatch(pname -> pname.getAge()==2);
        System.out.println(olist3);

    }
}
