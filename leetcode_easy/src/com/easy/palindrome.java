package com.easy;

import java.lang.reflect.Array;

public class palindrome {

	public static void main(String[] args) {
		int x =1221;
		int real =x;
		int temp=0;
		while(x!=0) {
			int lastDigit = x % 10;
			System.out.println("lastdigit ---> "+lastDigit);
			temp = lastDigit + (temp * 10);
			System.out.println("temp ---> "+temp);
			x = x / 10;
			System.out.println("x ---> "+x);
		}
		
		System.out.println(temp==real);
		
		/*
		 * String valueOf = String.valueOf(x); for (int i = 0; i < valueOf.length()/2;
		 * i++) { if(valueOf.charAt(i)!=valueOf.charAt(valueOf.length()-i-1)) {
		 * System.out.println("not palindrome"); System.exit(0); } }
		 * 
		 * System.out.println("palindrome");
		 */
	}

}
