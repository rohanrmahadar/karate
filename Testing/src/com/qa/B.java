package com.qa;

public class B {
	
	public static void main(String[] args)
	{

	String s1 = new String ("Test ABC");
	String s2 = new String("Test ABC");
	System.out.println(s1==s2);  //-----> False
	String s3= "Test ABC";
	System.out.println(s1==s3);//----> False
	String s4 = "Test ABC";
	System.out.println(s3==s4);//-----> True
	String s5 = "Test" + " ABC";
	System.out.println(s3==s5);//-----> True
	String s6 = "Test";
	String s7= s6+" ABC";  
	System.out.println(s3==s7);//---------> False
	final String s8 = "Test";
	String s9 = s8+" ABC"; 
	System.out.println(s6==s9);//-------> False
	}

}
