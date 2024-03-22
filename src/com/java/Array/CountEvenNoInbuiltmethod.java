package com.java.Array;

import java.util.Arrays;

public class CountEvenNoInbuiltmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {32,76,23,12,9};
		int sum =Arrays.stream(arr).filter(n ->n%2==0).sum();
		System.out.println(sum);

	}

}
