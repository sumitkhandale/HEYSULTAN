package com.sbm.stringcore;

public class Duplesis {
	public static void main(String[] args) {
		String navia = "beautiful beach";
		int i, j;
		int cnt=0;
		char[] ch = navia.toCharArray();
		System.out.println("The string is:" + navia);
		System.out.print("\n Duplicate Characters in above string are: ");
		for (i = 0; i < navia.length(); i++) {
			for (j = i + 1; j < navia.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j] + " ");
					cnt++;
					break;

				}
			}
		}
	}
}
