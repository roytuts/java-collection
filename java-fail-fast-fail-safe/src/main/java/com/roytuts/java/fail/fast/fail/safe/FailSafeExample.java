package com.roytuts.java.fail.fast.fail.safe;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailSafeExample {

    public static void main(String[] args) {
        ConcurrentMap<String, String> cMap = new ConcurrentHashMap<>();

        cMap.put("RedHat", "Unix");
        cMap.put("Google", "Android");
        cMap.put("Apple", "iOS");
        cMap.put("Microsoft", "Windows");
        cMap.putIfAbsent("RedHat", "Unix");

        cMap.forEach((k, v) -> System.out.println(k + " => " + v));

        Set<String> keys = cMap.keySet();

        for (Object key : keys) {
            // cMap.remove(key); //will not throw ConcurrentModificationException here
            cMap.put("abc", "value"); // will not throw ConcurrentModificationException here
        }

        System.out.println();

        cMap.forEach((k, v) -> System.out.println(k + " => " + v));
    }

}
