/*Q9: Check if Strings Are Rotations of Each Other
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.

*/

package com.string.questions;

public class Q9CheckforRotation {
	
	//checkIfRotation
	public static boolean checkIfRotation(String str1, String str2) {
		
		for(int i =0; i <str1.length(); i++) {
			if(str1.equals(str2)) {
				return true;
			}
			char last = str1.charAt(str1.length()-1);
			str1 = last + str1.substring(0, str1.length()-1);
			System.out.println(str1);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdab";
		
		System.out.println(checkIfRotation(str1, str2));
		
	}

}
