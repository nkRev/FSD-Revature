package com.nicky.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        
        map.put(1, "dog");
        map.put("name", "Mark");
        map.put("Roll", 100);
        map.put("active", true);
        
        Map newMap = new HashMap();
        newMap.put("car", "BMW");
        newMap.put("speed", 20);
        
        map.putAll(newMap);
        
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){

            //converts map to Map.Entry so keys and values can be retrieved separately
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

    }
}
