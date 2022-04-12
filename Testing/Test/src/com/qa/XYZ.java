package com.qa;

public class XYZ {
	
	public static void main(String[] args) {
		
	String str=	"Welcome Rohan";

		//emocleW nahoR
	
	int c=str.indexOf(" ");
	
	String s[]=str.split(" ");
	
	StringBuffer sb=new StringBuffer();
		
	for (int i = 0; i < s.length; i++) {							
		
		char[] ch=s[i].toCharArray();
		
		for (int j =ch.length-1 ; j >=0 ; j--) {
			
			sb=sb.append(ch[j]);
		}
	}
	
	sb.insert(c, " ");
	
	System.out.println(sb);

	}

}
