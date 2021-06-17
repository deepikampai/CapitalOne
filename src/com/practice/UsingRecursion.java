package com.practice;

public class UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useRecursion(10);

	}

	private static void useRecursion(int i) {
		// TODO Auto-generated method stub
		
		if(i> 1) {
			useRecursion(i-1);
		}
		System.out.println(i);
		
	}

}
