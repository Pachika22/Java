package com.corejava.examples.thread;

public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MyThread t1  = new MyThread();
		t1.start();
		synchronized(t1) {
			System.out.println("Main thread calling wait method");
			t1.wait();
			System.out.println("Main thread got notification");
			System.out.println("Total is:"+t1.total);
		}

	}

}
