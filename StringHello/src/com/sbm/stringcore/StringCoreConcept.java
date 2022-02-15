package com.sbm.stringcore;

import java.util.Arrays;
import java.util.Comparator;

public class StringCoreConcept {
	public static void main(String[] args) {
		/*String s = "Today is the happiest day of my life";
		String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(longest);*/
		String s = "The gym is my drug and i need my fix";
		String lom = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(lom);

	}
}
