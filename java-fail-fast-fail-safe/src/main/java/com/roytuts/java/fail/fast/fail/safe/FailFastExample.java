package com.roytuts.java.fail.fast.fail.safe;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FailFastExample {

    public static void main(String[] args) {
        Map<String, String> llMap = new TreeMap<>();

        llMap.put("RedHat", "Unix");
        llMap.put("Google", "Android");
        llMap.put("Apple", "iOS");
        llMap.put("Microsoft", "Windows");

        // iterate over HashMap
        llMap.forEach((k, v) -> System.out.println(k + " => " + v));
        System.out.println();

        // iterate using iterator
        Iterator<Entry<String, String>> iterator = llMap.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
                    .next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        Set<String> keys = llMap.keySet();
        
        for (Object key : keys) {
            llMap.remove(key); // it will throw the ConcurrentModificationException here
            llMap.put("abc", "value"); // it will throw the
                                       // ConcurrentModificationException here
        }
    }

}
