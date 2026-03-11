package com.string;

import java.util.*;

public class Builder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
		
		//StringBuilder Functions
		
		//append()>>> to concatenate the string at the end
		str.append("World");
		System.out.println(str); // will print "helloWorld"
	}

}
