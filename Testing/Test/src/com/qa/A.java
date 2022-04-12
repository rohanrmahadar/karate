package com.qa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A {

	public static void main(String[] args) {

		String s[] = {"bob","bob","bob","tom","tom","jo"};

		//String s[] = str.split(",");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {

			if (hm.containsKey(s[i])) {

				int count = hm.get(s[i]);

				hm.put(s[i], count + 1);
			} else {
				hm.put(s[i], 1);
			}
		}

		Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			
			Map.Entry<String, Integer> map = itr.next();
			System.out.println(map.getKey() + " " + map.getValue());
			
		}
	}

}
