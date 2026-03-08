package com.string;
import java.util.*;
public class StringBasics {
	public static void main (String[] args){
	//character Array of size 5
    // char[] arr = new char[5];
    // arr[0] = 'a';
    // arr[1] = 'b';
    // arr[2] = 'c';
    // arr[3] = 'd';
    // arr[4] = 'e';

    // for (char c : arr) {
    //     System.out.println(c);
    // }

     //String
    // String str = "DSA With Java";
    // System.out.println(str);

    // Taking String Input from user
    
    // Scanner sc = new Scanner(System.in);
    // String s = sc.next(); // will take only one word input>>ignore everything after 1st Space
    // System.out.println(s);  // I/P" Rohit Jha" >> O/P : "Rohit"

    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine(); // will take input. e.g., : i/p: "Rohit Jha"
    // System.out.println(str);  // O/P : "Rohit Jha"
    
    // String Initialization
	   String str = "DSA With Java";
    // System.out.println(str);
	
	//Basic String Functions   
	   
	   //length()
	   int strSize  = str.length();
	   System.out.println(strSize);
	   
	   //charAt()
	   char ch = str.charAt(5);
	   System.out.println(ch); // will print character at the index from string
	   
	   //indexOf() >> returns the index of first occurance of the character from string
	   int idx = str.indexOf('a');
	   System.out.println(idx);
	   
	   //compareTo() >> will compare the two strings, if exactly lexographically same >>will return 0>>if greater>>will return positive>>if less>>return negative
	   String str1 = "abc";
	   String str2 = "abc";
	   String str3 = "bbc";
	   String str4 = "cbc";
	   System.out.println(str1.compareTo(str2)); // str1==str2>>will return 0
	   System.out.println(str1.compareTo(str3)); // str1<str2>>>will return -1
	   System.out.println(str4.compareTo(str3)); // str4>str3>>>will return 1
	   
	   
	   //contains() >> will print true of it contains same string >>will return false if not
	   System.out.println(str.contains("ava")); //true >> as "DSA With Java"; contains >>"ava"
	   System.out.println(str.contains("all")); //false >> as "DSA With Java"; does not contains >>"all"
	   
	   //startsWith()>> will return if a string starts with given string
	   System.out.println(str.startsWith("DS")); //true >> as "DSA With Java"; startsWith >>"DS"
	   System.out.println(str.startsWith("MS")); //flase >> as "DSA With Java"; does not startsWith >>"MS"
    

}
}
