package com.sbm.stringcore;

import java.util.Set;
import java.util.TreeSet;

public class DupCharCore {
	public static void main(String[] args) {
		String myName = "geeksforgeek";
		char[] ch = myName.toCharArray();
		Set uChar = new TreeSet<>();
		Set dChar = new TreeSet<>();
		for (char c : ch) {
			if(dChar.add(c)==false){
				uChar.add(c);
				
			}
		}
		uChar.forEach(deepika->System.out.println(deepika));
	}
}
