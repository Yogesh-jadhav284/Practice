package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class entrySetDemo {
    public static void main (String[] args){
        var countryName = new HashMap<String, String>();
        countryName.put("India","New Delhi");
        countryName.put("USA","WDC");
        countryName.put("France","Paris");
        countryName.put("Bangladesh","Dhaka");
        approach2(countryName);
    }
    public static void approach2(HashMap<String, String> countryName){
       Set<Map.Entry<String, String>> entry = countryName.entrySet();
        System.out.println(countryName.entrySet());
//       Iterator<Map.Entry<String, String>> iterator = entry.iterator();
//       while(iterator.hasNext()){
//           Map.Entry<String, String> entires = iterator.next();
//           System.out.println(entires);
//           String key = entires.getKey();
//           String capital = entires.getValue();
//           System.out.println(key+" "+capital);

           for(Map.Entry<String, String> keyed:entry){
               System.out.println(keyed);
           }
       }


    }

