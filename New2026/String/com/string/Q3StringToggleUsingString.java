//Toggle Uppercase to Lowercase and Vice versa for a given String using String. Example: PhysICS>> pHYSics

package com.string;

import java.util.*;

public class Q3StringToggleUsingString {

	public static void main(String[] args) {
		String str = "PhYSiCS";
		System.out.println("String Before toggle: " + str);
		for (int i = 0; i < str.length(); i++) {
			boolean capFlag = true; // true for Capital
			char ch = str.charAt(i); // getting Char At i

			if (ch == ' ')
				continue;

			int ascii = (int) ch; // finding Ascii value of Character
			if (ascii >= 97) // smallCase
				capFlag = false; // for smallCase Setting as False

			if (capFlag == true) {
				ascii = ascii + 32; // 32 is difference between each Upper Case and Lowercase chars in Ascii
				char c = (char) ascii; // getting char corresponding to ASCII value
				str = str.substring(0, i) + c + str.substring(i + 1, str.length());
			} else {
				// Lower to upperCase
				ascii = ascii - 32;
				char c = (char) ascii;
				str = str.substring(0, i) + c + str.substring(i + 1, str.length());
			}
		}
		System.out.println("String After toggle: " + str);
	}
}
