package com.string.questions;

public class Q6ReverseString {

	public static void main(String[] args) {
		String s = "physics";

        //As String doesn't have in built method reverse()>> hence converting it to StringBuilder
		StringBuilder sb = new StringBuilder(s);

		// using in-built method >> reverse()
		sb.reverse();

        //converting StringBuilder back to String 
        String result = sb.toString();
        
		System.out.println(result); // will print : "scisyhp"

	}
}
