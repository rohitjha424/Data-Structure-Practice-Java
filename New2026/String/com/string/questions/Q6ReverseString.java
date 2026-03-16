package com.string.questions;

public class Q6ReverseString {

	public static void main(String[] args) {
		String s = "physics";

		// using in-built method >> reverse()
		StringBuilder str = new StringBuilder(s);
		str.reverse();

		System.out.println(str); // will print : "scisyhp"

	}
}
