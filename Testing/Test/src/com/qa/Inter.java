package com.qa;

import java.util.ArrayList;
import java.util.Collections;

public class Inter implements Comparable<String> {

	public static void main(String[] args) {

		String str[] = { "India", "UK", "USA" };
		
		int a[]=new int[5];
				
		String arr[]=new String[3];
		
		int count=0;
		
		for (int i=str.length-1; i >= 0; i--) {
			
			arr[count]=str[i];
			
			count++;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		
		/*
		 * ArrayList al=new ArrayList();
		 * 
		 * 
		 * for (int i = 0; i < str.length; i++) {
		 * 
		 * al.add(str[i]);
		 * 
		 * }
		 * 
		 * Collections.sort(al,Collections.reverseOrder());
		 * 
		 * for (Object object : al) {
		 * 
		 * System.out.println(object); }
		 */
		
		
		
		
		
		
		
		
		
		

		/*
		 * for (int i = 0; i < str.length; i++) {
		 * 
		 * if (str[i].charAt(0) == 'U') {
		 * 
		 * System.out.println(str[i]);
		 * 
		 * }
		 * 
		 * }
		 */

	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
