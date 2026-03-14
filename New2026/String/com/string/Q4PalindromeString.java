package com.string;
import java.util.*;
public class Q4PalindromeString {

	public static void main(String[] args) {
		String str = "abcdcba";
		StringBuilder gtr = new StringBuilder(str); // String to StringBuiler for using its functions
		gtr.reverse(); // reversing String
		String s = gtr+""; // adding empty String to StringBuilder will convert it back to String
		if(str.equals(s)) {
			System.out.println("Palindrome String !!!");
		}
		else {
			System.out.println(" Not a Palindrome String!!!");
		}
	}
}
