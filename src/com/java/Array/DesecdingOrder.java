package com.java.Array;

public class DesecdingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr [] = {20,45,12,87,21,40};
      
            int temp;
            
            for(int i= 0; i<arr.length;i++) {
            	for(int j =i+1;j<arr.length;j++) {
            		if(arr[i]<arr[j]) {
            			temp=arr[i];
            			arr[i]= arr[j];
            			arr[j] = temp;
            		}
            	}
            }
            for(int i = 0; i<arr.length;i++) {
            	System.out.print(    arr[i]  + " ");
            	
            }
            
            
	}

}
