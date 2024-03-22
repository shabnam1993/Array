package com.java.Array;

public class UppercaseCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char [] arr = new char [26];
      char c = 64;
       for(int i =0; i<arr.length; i++) {
    	   arr[i]= c++;
       }
       for(int arr1 : arr) {
    	   System.out.println(arr1);
       }
      
	}

}
