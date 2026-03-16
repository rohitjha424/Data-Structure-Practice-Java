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
			
			for (j = i+1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				else {
					sb.append(str.charAt(i));
					i=j-1;
					break;
				}
			}
			
	
			if(count>1) {
				sb.append(count);
			}
			if(j==str.length()-1 && (str.charAt(j) != str.charAt(j-1))) {
				sb.append(str.charAt(j));
			}

		}
		System.out.println(sb);

	}

}
