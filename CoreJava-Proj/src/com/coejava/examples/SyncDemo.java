package com.coejava.examples;

public class SyncDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// first example
//		Display d = new Display();
//		MyThread thread = new MyThread(d, "Dhoni");
//		MyThread thread1 = new MyThread(d, "YuvRaaj");
//		thread.start();
//		thread1.start();

		
		//second way of execution
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread thread = new MyThread(d1, "Dhoni");
		MyThread thread1 = new MyThread(d2, "YuvRaaj");
		thread.start();
		thread1.start();

	}

}
class Display{
	public static synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			try {
			System.out.print("Good morning:");
			Thread.sleep(2000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display dis,String name){
		this.d = dis;
		this.name= name;
	}
	public void run() {
		d.wish(name);
	}
	
}