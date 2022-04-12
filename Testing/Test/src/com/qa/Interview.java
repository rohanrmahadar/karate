package com.qa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Interview {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,3,4};
		//output:{1,2,4}
	
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < array.length; i++) {
			
			
			
			if (hm.containsKey(array[i])) {
				
			
				hm.get(array[i]);
				hm.remove(array[i]);
				
			}
			
			hm.put(array[i], i);
		}
		
		
		/*
		 * for (int i = 0; i < array.length; i++) {
		 * 
		 * for (int j = i; j < array.length; j++) {
		 * 
		 * if (array[i]==array[j]) {
		 * 
		 * 
		 * }else {
		 * 
		 * System.out.print(array[j]); } }
		 * 
		 * }
		 */
		
		
	}

}
