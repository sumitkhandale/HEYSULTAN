package com.sbm.stringcore;

import java.util.Arrays;
import java.util.Comparator;

public class LaregeSt {
	public static void main(String[] args) {
		String str = "Eat Sleep And Break The Streek";
		String sulTan  = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(sulTan);
	}
}	
