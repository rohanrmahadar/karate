package com.test;

public interface Testable {

	int i=10;
	
	default void m1() {
		
		//System.out.println(i);
	}
}
