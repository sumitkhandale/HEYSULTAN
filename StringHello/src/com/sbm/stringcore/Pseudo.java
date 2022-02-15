package com.sbm.stringcore;

public class Pseudo {
	public static void main(String[] args) {
		int num = 148535;
		int rev = 0;
		while(num!=0){
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}

		System.out.println("\n The reverse of the given no is:  "+rev); 

	}
}
