/* Q2: Given string s , print all the substring of s
i/p : 
	 s = "abcd"
o/p :
	a ab abc abcd b bc bcd c cd d
	
*/

package com.string;

public class Q2SubString {

	public static void main(String[] args) {
		String s = "abcd";

		for (int i = 0; i <= s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {				
				System.out.print(s.substring(i, j)+ " ");
			}
		}

	}
}
