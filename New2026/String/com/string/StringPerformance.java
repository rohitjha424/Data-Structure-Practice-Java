package com.string;
import java.util.*;
public class StringPerformance {

	public static void main(String[] args) {
		
		String str = "";
		for(int i =1; i<=10; i++) {
			str = str +i; // >> This operation will create a lot of strings >> performance issue 
			
		}
		System.out.println(str);
	}
}
