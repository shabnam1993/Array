package com.java.Array;

import java.util.Arrays;

public class FindsSecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr [] = {1,3,6,87,32,54,21};
		
		int temp, size;
		temp=0;
		size=arr.length;
		for(int i = 0; i<arr.length;i++) {
			
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]>arr[j]) {
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				  
			  }
		}
		}
		for(int i = 0; i<arr.length;i++) {
		System.out.print( +arr[i] +" ");
		}
//		Arrays.sort(arr);
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]);
		
		System.out.println();
	System.out.println("print 2nd largest number in array  =" +    arr[arr.length-5]);
		

//	}

//}
	
}	
	
}
	
	
	
	
