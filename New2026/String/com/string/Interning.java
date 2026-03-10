package com.string;
import java.util.*;
public class Interning {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		String x = "Hello"; 
		
		//Technically String s and x both are pointing to are String in Heap
		
		x = "Mello"; // will create new String >>"Mello" and x will point to it
		
	}

}
