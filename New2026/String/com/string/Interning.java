package com.string;
import java.util.*;
public class Interning {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		String x = "Hello"; 
		
		//Technically String s and x both are pointing to are String in Heap >> called Interning
		
		x = "Mello"; // will create new String >>"Mello" and x will point to it
		
		
		//if you need to create a new String with same String characters>> then use new
		
		String y = new String("Hello"); //will create a new String 
		
		
		//immutability of Strings in Java
		
		//s.charAt(1) = 'D'; // >> will throw Error>> Strings characters cannot be modified
		
	}

}
