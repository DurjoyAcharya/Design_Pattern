package Bypass;

import java.util.*;

public class MapSortedDemo {
    public static void main(String[] args) {
        Map<String,Integer> l=new HashMap<>();
        l.put("Eight",8);
        l.put("Five",5);
        l.put("Six",6);
        l.put("Two",2);
        l.put("One",1);
        l.put("Nine",9);
        l.put("Seven",7);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(l.entrySet());
    //    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
          //  @Override
      //      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
         //       return o1.getValue().compareTo(o2.getValue());
           // }
        //});
       //  Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
//        Collections.sort(list,(l1,l2)->{
//            return l1.getKey().compareTo(l2.getKey());
//        });
        Collections.sort(list, Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<String,Integer> entry:list)
            System.out.println(entry);
    }
}
