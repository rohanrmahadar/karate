package com.qa;

public class A {
	
	
	public static void main(String[] args) {
		
		String str="This is a code for A";

		//output: A for code a is This

		String arr[]=str.split(" ");

		for (int i=arr.length-1;i>=0;i--){

		System.out.print(arr[i]+" ");

		}
	}

}
