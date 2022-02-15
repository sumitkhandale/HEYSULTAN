package com.sbm.stringcore;

public class QuConcept {
	
	public static void main(String[] args) {
		
		String str = "welcometofitnessgym";
		int cnt = 0;
		int i;
		int j;
		char[] ch = str.toCharArray();
		System.out.println("duplicate character are: ");
		for(i = 0;i<str.length();i++){
			for(j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[j]);
					cnt++;
					break;
				}
			}
		}
	}
	
}
