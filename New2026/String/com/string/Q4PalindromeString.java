package com.string;
import java.util.*;
public class Q4PalindromeString {

	public static void main(String[] args) {
		String str = "abcdcba";
		
		//using reverse() String Builder pre-built Method
//		StringBuilder gtr = new StringBuilder(str); // String to StringBuiler for using its functions
//		gtr.reverse(); // reversing String
//		String s = gtr+""; // adding empty String to StringBuilder will convert it back to String
//		if(str.equals(s)) {
//			System.out.println("Palindrome String !!!");
//		}
//		else {
//			System.out.println(" Not a Palindrome String!!!");
//		}
		
		// Suing for Loop
		
		int i=0;
		int j = str.length()-1;
		boolean isPalindrome= true;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}
			else {
				isPalindrome =false;
				break;
			}
		
		}
		if(isPalindrome==true) {
			System.out.println("Palindrome String!!!");
		}
		else {
			System.out.println("Not a Palindrome String!!!");
		}
	}
}
