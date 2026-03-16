/*Q7 : Reverse Each word of a String
Example :
	input: "I am an Engineer"
	output: "I ma na reenignE"
*/

package com.string.questions;

public class Q7ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "I am an Engineer ";

		// Approach >> take one word at a time store in SStringBuilder and reverse it
		// and Store in Ans.

		// keeping ans and String builder empty
		String ans = "";
		StringBuilder sb = new StringBuilder("");

		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			//checking when Space (a word ends)
			if (str.charAt(j) == ' ') {
				sb = new StringBuilder(str.substring(i, j)); 	// taking that Word and Storing to SB
				i = j + 1; 										// moving initial pointer to next word.
				sb.reverse(); 									// reversing string builder word.
				ans = ans + sb.toString() + " ";				//Storing reversed word to ans with Space
				sb = new StringBuilder("");						//emptying SB.
			}
		}

		// removing Extra Space
		String finalOutput = ans.trim();

		System.out.println(finalOutput);

	}
}
