package Sorting_Comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayListSortingDemo {
    public static void main (String[] args){
        ArrayList<String> countryName = new ArrayList<>();
        countryName.add("USA");
        countryName.add("India");
        countryName.add("China");
        countryName.add("Russia");
        countryName.add("Belarus");
        System.out.println(countryName);
        countryName.sort(Comparator.naturalOrder());
        System.out.println(countryName);
        countryName.sort(Comparator.reverseOrder());
        System.out.println(countryName);
        countryName.sort(new LastCharComparision());
        System.out.println(countryName);


    }
}
