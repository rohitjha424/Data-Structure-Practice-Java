package com.string;

import java.util.*;

public class PalindromicSubstring {

	// method to check ifPalindrome
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		boolean isPalin = true;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "abcbd";
		int count=0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				if(isPalindrome(str.substring(i,j))==true) {
					System.out.println(str.substring(i,j) + " ");
					count++;
				}
			}
		}
		System.out.println("Total Number of Palindromic Substring in given String is "+ count);
		
	}
}
