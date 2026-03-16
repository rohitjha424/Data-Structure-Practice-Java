/*Q8 Compress Duplicate characters of the String followed by the number of consecutive duplicates
Example :
	input: "aaabbbbccddde"
	output: "a3b4c2d3e"
*/
package com.string.questions;

public class Q8CompressDuplicateCharacters {

	public static void main(String[] args) {
		String str = "aaabbbbccddde";
		StringBuilder sb = new StringBuilder();

		int j;
		for (int i = 0; i < str.length(); i++) {
			int count = 1;

			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));

			if (count > 1) {
				sb.append(count);
			}
		}
		
		System.out.println(sb);
	}
}
