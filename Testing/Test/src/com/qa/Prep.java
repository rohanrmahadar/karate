package com.qa;

public class Prep {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * int a=0,b=0,c=1;
		 * 
		 * 
		 * for(int i=0;i<10;i++) {
		 * 
		 * a=b; b=c; c=a+b;
		 * 
		 * System.out.print(a+" "); }
		 * 
		 */

		int a[] = { 1, 5, 6, 2, 10 };

		int rotation=2;
		// output: 10,2,6,5,1

		/*
		 * for (int i = a.length - 1; i >= 0; i--) {
		 * 
		 * System.out.print(a[i] + " ");
		 * 
		 * }
		 */
		

		for (int i = a.length - 1; i >= rotation; i--) {

			
			System.out.print(a[i] + " ");

		}
		
		for (int i = 0; i < rotation; i++) {
			
		}
		
		
	}

}
