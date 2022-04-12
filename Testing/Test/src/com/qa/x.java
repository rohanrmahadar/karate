package com.qa;

public class x {
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,6,7,7};
		
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			
			count++;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					
					System.out.println("Repeating number is: "+arr[j]);
				}
			}
			
			
			if(arr[i]==count) {
				
				//System.out.println();
				
			}else {
				
				System.out.println("Missing no is: "+count);
			}
		}
		
		
	
	
	}

}
