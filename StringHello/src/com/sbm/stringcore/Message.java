package com.sbm.stringcore;

public class Message {
	public static void main(String[] args) {
		try {
			throw new CustomException("Invalid Values");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
