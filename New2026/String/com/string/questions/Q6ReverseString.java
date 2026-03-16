package com.string.questions;

public class Q6ReverseString {

	public static void main(String[] args) {
		String s = "physics";

        //As String doesn't have in built method reverse()>> hence converting it to StringBuilder
		StringBuilder str = new StringBuilder(s);

		// using in-built method >> reverse()
		str.reverse();

        //converting StringBuilder back to String 
        String result = str.toString();
        
		System.out.println(result); // will print : "scisyhp"

	}
}
