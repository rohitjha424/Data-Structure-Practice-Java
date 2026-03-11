package com.string;

import java.util.*;

public class Builder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
		
		//StringBuilder Functions
		
		//append()>>> to concatenate the string at the end
//		str.append("World"); //appending String
//		System.out.println(str); // will print "helloWorld"
		
		str.append(3); // appending integer
		System.out.println(str); // will print "hello3"
		
		str.append('t'); //appending char
		System.out.println(str); // will print "hello3t"
		
		//setCharAt()>> used to modify the character of a string at particular index
//		str.setCharAt(0, 'm');
//		System.out.println(str); // will print "mello"
//		
//		
//		//insert()>>will insert character within the String>>length will also increase
//		
//		str.insert(2, 'y');// inserting char
//		System.out.println(str); // will print "meyllo"
//		
//		str.insert(1, 5); // inserting integer
//		System.out.println(str); // will print "m5eyllo"
//		
//		str.insert(3, "Hey"); //inserting String
//		System.out.println(str); // will print "m5eHeyyllo"
		
		
	}

}
