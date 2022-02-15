package com.sbm.stringcore;

public class CustomException extends Exception{
	String msg;
	public CustomException(String msg){
		this.msg = msg;
	}
	@Override
	public String toString(){
		return "CustomException [msg=" + msg + "]";
	}
	/*@Override
	public String toString() {
		return "CustomException [msg=" + msg + "]";
	}*/
	
}
