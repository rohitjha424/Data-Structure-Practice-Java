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

		String str = "abcdcba";
		boolean isPalin = isPalindrome(str);
		System.out.println(isPalin);
	}
}
