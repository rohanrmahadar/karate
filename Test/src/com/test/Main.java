package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Singleton first = Singleton.getInstance();  
        System.out.println("First instance integer value:"+first.i);  
        first.i=first.i+90;  
        Singleton second = Singleton.getInstance();  
        System.out.println("Second instance integer value:"+second.i);
        
        Map<Integer, String> map=new TreeMap<Integer, String>();
        map.put(1, "A");
        map.put(3, "R");
        map.put(2, "Z");
        
       for (Map.Entry<Integer, String> m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
        
	}

}
