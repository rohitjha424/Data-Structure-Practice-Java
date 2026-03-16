package com.string.questions;

public class Q6ReverseString {
	
	
	public static void main(String[] args) {
		String s = "physics";

//        //As String doesn't have in built method reverse()>> hence converting it to StringBuilder
//		StringBuilder sb = new StringBuilder(s);
//
//		// using in-built method >> reverse()
//		sb.reverse();
//
//        //converting StringBuilder back to String 
//        String result = sb.toString();
//        
//		System.out.println(result); // will print : "scisyhp"
		
		
		//Without Using in built function
		
		//1) applying Backtracking of String 
		
//		String reversed = "";
//		
//		for(int i = s.length()-1; i>=0; i-- ) {
//			reversed = reversed+ s.charAt(i);
//		}
//		System.out.println(reversed); // will print : "scisyhp"
		
//		
		//2) using 2 pointers Approach 
		
		//here we will use char[] array to swap the first and last chars of string 
		char[] charArray = s.toCharArray();
		
		int i = 0;
		int j = charArray.length-1;
		
		while (i<j) {
			
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j]= temp;
			
			i++;
			j--;
		}
		String reversedString = new String(charArray);
		System.out.println(reversedString);
		
		
		

	}
}
