package com.qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dummy {

	// Find the length of longest good string i.e. longest substring length that has
	// vowels only. For e.g. - "view" - output is 2(ie), for "rescueoperation",
	// output is 3(ueo).

	public static void main(String[] args) {

		List<String> l=new ArrayList<String>();
		
		String str = "rescueoperation";

		char[] ch = str.toCharArray();

		String sb = new String();
		 String s =new String();

		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u') {

				sb = sb + ch[i];
				// sb += sb.charAt(i);
				count++;

			} else {
				
				l.add(sb);
				sb = new String();

			}

		}

		System.out.println(count + "(" + l + ")");

	}

}
