package com.sbm.stringcore;

import java.util.HashMap;

public class HelloString {
	public static void main(String[] args) {
		String str = "initiates";
		int i;
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(i=str.length()-1;i>=0;i--){
			if(hmap.containsKey(str.charAt(i))){
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
			else{
				hmap.put(str.charAt(i), 1);
			}
		}
		System.out.println("counting occurrences of each character in string: "+hmap);
		
		
	}

}



