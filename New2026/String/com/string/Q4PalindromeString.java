package com.string;
import java.util.*;
public class Q4PalindromeString {

	public static void main(String[] args) {
		String str = "abcdcba";
		StringBuilder gtr = new StringBuilder(str);
		gtr.reverse();
		String s = gtr+"";
		if(str.equals(s)) {
			System.out.println("Palindrome String !!!");
		}
		else {
			System.out.println(" Not a Palindrome String!!!");
		}
	}
}
