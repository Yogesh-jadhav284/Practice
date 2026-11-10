package Sorting_Comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSort  {
    public static void main (String[] args){
//        Student s1 = new Student("yogesh",148, 89);
//        Student s2 = new Student("simran", 127, 95);
        var Studentlist= new ArrayList<Student>();
        Studentlist.add(new Student("John", 167, 97));
        Studentlist.add(new Student("Smith", 168, 92));
        Studentlist.add(new Student("Will", 169, 92));
        Studentlist.add(new Student("Madan", 170, 99));
        System.out.println(Studentlist);
        //        System.out.println("Before Sorting:");
//        System.out.println(Studentlist);


//        Collections.sort(Studentlist);
//        System.out.println(Studentlist);
        System.out.println("after comparing with id");
        Collections.sort(Studentlist, new StudentIDcompare());

        Collections.sort(Studentlist, new StudentIDcompare());
    }
}
