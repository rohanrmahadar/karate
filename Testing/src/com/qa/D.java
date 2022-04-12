package com.qa;

public class D {

	public static void main(String[] args) {
		
		
		String str="One Lac Three Thousand Three Hundred Three";
		
		String number[]=str.split(" ");
		
		String no;
		
		String convert;
		
		for (int i = 0; i < number.length; i++) {
			
			no=number[i];
			
			if(no.equalsIgnoreCase("one")) {
				
				convert="1";
				
			}else if(no.equalsIgnoreCase("two")) {
				convert="2";
				
			}else if(no.equalsIgnoreCase("three")) {
				convert="3";
				
			}else if(no.equalsIgnoreCase("four")) {
				convert="4";
				
			}else if(no.equalsIgnoreCase("five")) {
				convert="5";
				
			}else if(no.equalsIgnoreCase("six")) {
				convert="6";
				
			}else if(no.equalsIgnoreCase("seven")) {
				convert="7";
				
			}else if(no.equalsIgnoreCase("eight")) {
				convert="8";
				
			}else if(no.equalsIgnoreCase("nine")) {
				convert="9";
				
			}else if(no.equalsIgnoreCase("Hundred")) {
				convert="";
				
			}else if(no.equalsIgnoreCase("Thousand")) {
				
				convert="";
			}else if(no.equalsIgnoreCase("Lac")) {
				
				convert="";
				
			}
		}
	
	}

}
