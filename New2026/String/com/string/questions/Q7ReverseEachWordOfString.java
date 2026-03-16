/*Q7 : Reverse Each word of a String
Example :
	input: "I am an Engineer"
	output: "I ma na reenignE"
*/

package com.string.questions;

public class Q7ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "I am an Engineer";

		// Approach >> take one word at a time store in SStringBuilder and reverse it and Store in ans.

		// keeping ans String builder empty
		StringBuilder ans = new StringBuilder();
		
		int i = 0;
		for (int j = 0; j <= str.length(); j++) {
			//checking if there is Space (a word ends) or String ends condition
			if (j == str.length() || str.charAt(j) == ' ') {
				StringBuilder sb = new StringBuilder(str.substring(i, j)); 	// taking that Word and Storing to SB
				sb.reverse(); 												// reversing string builder word.
				ans = ans.append(sb)	;									//Storing reversed word ans with append 
				if (j != str.length()) {
		             ans.append(" ");
		           }
				i = j + 1; 													// moving initial pointer to next word.
			}
		}
		
		
		System.out.println(ans.toString());

	}
}
