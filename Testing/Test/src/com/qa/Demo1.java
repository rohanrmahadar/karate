package com.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//l1- {3, 9, 6, 10, 4, 5, 12}
		//l2-{4, 6, 9, 3, 10, 7, 5}
		
		
		//l3={7,12}
		
		
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		
		l1.add(3);
		l1.add(9);
		l1.add(6);
		l1.add(10);
		l1.add(4);
		l1.add(5);
		l1.add(12);		
		
		Collections.sort(l1);
		
		
		l2.add(4);
		l2.add(6);
		l2.add(9);
		l2.add(3);
		l2.add(10);
		l2.add(7);
		l2.add(5);
		
		for (Iterator<Integer> iterator = l1.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
		/*
		 * for (Iterator<Integer> iterator = l2.iterator(); iterator.hasNext();) {
		 * 
		 * int i= iterator.next();
		 * 
		 * if(!(l1.contains(i))) { l3.add(i); } } for (Iterator<Integer> iterator =
		 * l1.iterator(); iterator.hasNext();) {
		 * 
		 * int i= iterator.next();
		 * 
		 * if(!(l2.contains(i))) { l3.add(i); } }
		 * 
		 * for (Iterator<Integer> iterator = l3.iterator(); iterator.hasNext();) {
		 * 
		 * System.out.print(" "+iterator.next());
		 * 
		 * }
		 */
	}

}
