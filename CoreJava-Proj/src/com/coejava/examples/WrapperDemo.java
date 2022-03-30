package com.coejava.examples;

public class WrapperDemo {
	
	int i=5;
	
	Integer ii = i; //Auto boxing
	
	int value = ii; //Auto unboxing
	
	Integer iii = Integer.valueOf(i); //Boxing
	
	int x = iii.intValue();//Unboxing

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="123";
		
		System.out.println("the value of str is:"+Integer.parseInt(str));

	}

}
