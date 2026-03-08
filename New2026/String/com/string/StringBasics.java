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
    
    
    

}
}
