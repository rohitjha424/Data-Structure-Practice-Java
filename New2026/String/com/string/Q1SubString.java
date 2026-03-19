//Q1) What will be the o/p of the given code below 

package com.string;

public class Q1SubString {

	public static void main(String[] args) {
		String s = "physics";

		for (int j = 2; j < 4; j++) {
			System.out.print(s.substring(j));
		}

	}
}

/*
 * O/P:
 * 
 * ysicssics
 * 
 */