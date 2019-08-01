package com.barton;

import java.util.HashMap;

public class Size {
    public static void main(String[] args) {


    HashMap<Integer, String>hashmap = new HashMap<Integer, String>();

    hashmap.put(11, "Value1");
    hashmap.put(12, "Value2");
    hashmap.put(13, "Value3");
    hashmap.put(15, "Value4");

        System.out.println("Size of HashMap : " + hashmap.size());
}
}