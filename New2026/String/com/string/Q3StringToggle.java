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
			boolean capFlag = true;
			char ch = str.charAt(i);
			int ascii = (int) ch;
			if (ascii >= 97)
				capFlag = false;
			if (capFlag == true) {
				ascii = ascii + 32;
				char c = (char) ascii;
				str.setCharAt(i, c);
			} else {
				ascii = ascii - 32;
				char c = (char) ascii;
				str.setCharAt(i, c);
			}

		}
		System.out.println(str);

	}
}
