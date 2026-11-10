package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapdemo {
    public  static void main(String[] args){
        var countryName = new HashMap<String, String>();
            countryName.put("India","New Delhi");
            countryName.put("USA","WDC");
            countryName.put("France","Paris");
            countryName.put("Bangladesh","Dhaka");
            approach1(countryName);


            }
    public static void approach1(HashMap<String, String > countryName){
        Set<String> keys = countryName.keySet();
        System.out.println(keys);

        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);

        }


    }
}


