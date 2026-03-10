package com.string;
import java.util.*;

public class String_equals {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello"; // will point exactly where s1 is pointing due to interning behavior
		String s3 = new String("Hello"); // create new String with same characters as s1 and s2
		
		System.out.println(s1==s2); // will print true >> as both pointing to same address
		
		System.out.println(s1==s3); // will print false >> as s3 is different String (address)>> hence we need equals()
		 
		//equals()
		
		System.out.println(s1.equals(s3)); // will print true>> it compares the actual characters 
		
	}
}
