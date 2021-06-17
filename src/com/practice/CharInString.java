package com.practice;

public class CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello eWorld";
		char c = 'e';
		
		int count = countCharacters(str,c);
		System.out.println("Count:" +count);
	}

	private static int countCharacters(String str, char c) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
