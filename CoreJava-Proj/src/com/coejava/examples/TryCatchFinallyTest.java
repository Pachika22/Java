package com.coejava.examples;

public class TryCatchFinallyTest implements Runnable{
	
	private void testMethod() throws InterruptedException{
		try {
			System.out.println("In try block----");
			throw new NullPointerException();
		}
		catch(NullPointerException np) {
			System.out.println("In Catch Block---");
		}
		finally {
			System.out.println("In Finally block");
		}
	}
	
	@Override
	protected void finalize() throws Throwable{
		
		System.out.println("In finalize method---");
		super.finalize();
		
	}
	
	public void run() {
		try {
			testMethod();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
