package com.coejava.examples;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass sc = SingletonClass.getInstance();
		
	}

}
class SingletonClass{
	
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {
		System.out.println("In constructor");
	}
	
	public static SingletonClass getInstance() {
		//System.out.println("Hello....");
		return singletonInstance;
	}
	
}