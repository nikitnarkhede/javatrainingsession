package Assignment3;

import Assignment2.Product;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        List<MobileNumber> mn = new ArrayList<>();
        mn.add(new MobileNumber("1234"));

        List<MobileNumber> mn1 = new ArrayList<>();
        mn1.add(new MobileNumber("3333"));

        List<MobileNumber> mn2 = new ArrayList<>();
        mn2.add(new MobileNumber("1233"));

        List<MobileNumber> mn3 = new ArrayList<>();
        mn3.add(new MobileNumber("3331"));
        List<MobileNumber> mn4 = new ArrayList<>();
        mn4.add(new MobileNumber("234"));

        Student s = new Student("Nikit",12,new Address("1234"),mn);
        Student s1 = new Student("Akash",11,new Address("1111"),mn1);
        Student s2 = new Student("Akshay",1,new Address("123"),mn2);
        Student s3 = new Student("VP",18,new Address("124"),mn3);
        Student s4 = new Student("CP",12,new Address("134"),mn4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println("-------------------");
        for(Student sl: studentList){
            System.out.println("-------------------");
            if(sl.getName().equalsIgnoreCase("JAYESH"))
                System.out.println(sl.toString());
    }
        for(Student sl: studentList){
            System.out.println("-------------------");
            if(sl.getAddress().getZipcode().equalsIgnoreCase("1234"))
                System.out.println(sl.toString());
        }
        System.out.println("++++++++++++++++++++++++++++++");
        for(Student sl: studentList) {
            for (MobileNumber M : sl.getMobileNumbers())
                if (M.getNumber().equalsIgnoreCase("3333"))
                    System.out.println(sl.toString());
        }

        System.out.println("*******************************");


        for(Student sl: studentList) {
            for (MobileNumber M : sl.getMobileNumbers())
                if (M.getNumber().equalsIgnoreCase("1234") || M.getNumber().equalsIgnoreCase("1233"))
                    System.out.println(sl.toString());
        }


        List<Student> studentList1 = new ArrayList<>();
        List<TempStudent> temp = new ArrayList<>();
        List<MobileNumber> mnt = new ArrayList<>();
        mn.add(new MobileNumber("1234"));

        List<MobileNumber> mnt1 = new ArrayList<>();
        mn1.add(new MobileNumber("3333"));

        List<MobileNumber> mnt2 = new ArrayList<>();
        mn2.add(new MobileNumber("1233"));

        List<MobileNumber> mnt3 = new ArrayList<>();
        mn3.add(new MobileNumber("3331"));
        List<MobileNumber> mnt4 = new ArrayList<>();
        mn4.add(new MobileNumber("234"));

        TempStudent st = new TempStudent("Nikit",12,new Address("1234"),mnt);
        TempStudent st1 = new TempStudent("Akash",11,new Address("1111"),mnt1);
        TempStudent st2 = new TempStudent("Jayesh",1,new Address("123"),mnt2);
        TempStudent st3 = new TempStudent("VP",18,new Address("124"),mnt3);
        TempStudent st4 = new TempStudent("CP",12,new Address("134"),mnt4);

        temp.add(st);
        temp.add(st1);
        temp.add(st2);
        temp.add(st3);
        temp.add(st4);
//        studentList1.addAll(temp.stream().toList());

        List<String> sn = new ArrayList<>();
        for(Student sl: studentList){
            sn.add(sl.getName());
        }
        System.out.println(sn);
        System.out.println("*******************************");


        StringBuffer sb = new StringBuffer();
        for(Student sl: studentList){
            sb.append(sl.getName());
            sb.append(" ");
        }
        System.out.println(sb);
        System.out.println("*******************************");

        List<String> sn1 = new ArrayList<>();
        for(Student sl: studentList){
            sn1.add(sl.getName().toUpperCase());
        }
        System.out.println(sn1);
        System.out.println("*******************************");
        Collections.sort(studentList, new SortStudent());
        System.out.println(studentList);


        System.out.println("*******************************");
        List<String> sn2 = new ArrayList<>();
        for(Student sl: studentList){
            if(sl.getName().startsWith("a") || sl.getName().startsWith("A"))
                sn2.add(sl.getName().toUpperCase());
        }
        System.out.println(sn2);
    }




}
class SortStudent implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {

        return a.getName().compareTo(b.getName());
    }
}

