//Toggle Uppercase to Lowercase and Vice versa for a given String. Example: PhysICS>> pHYSics

package com.string;

import java.util.*;

public class Q3StringToggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());

		System.out.println(str);

		// toggle
		for (int i = 0; i < str.length(); i++) {
			boolean capFlag = true; // true for Capital
			char ch = str.charAt(i); // getting Char At i
			int ascii = (int) ch; // finding Ascii value of Character
			if (ascii >= 97) // smallCase
				capFlag = false; // for smallCase Setting as False

			if (capFlag == true) {
				ascii = ascii + 32; // 32 is difference between each Upper Case and Lowercase chars in Ascii
				char c = (char) ascii; // getting char corresponding to ASCII value
				str.setCharAt(i, c); // setting the toggle Char
			} else {
				// Lower to upperCase
				ascii = ascii - 32;
				char c = (char) ascii;
				str.setCharAt(i, c);
			}
		}
		System.out.println(str);

	}
}
