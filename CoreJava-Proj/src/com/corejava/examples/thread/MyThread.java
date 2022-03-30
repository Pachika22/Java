package com.corejava.examples.thread;

class MyThread extends Thread{
	int total =0;
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			
			System.out.println("Child thread starts calculation");
			for(int i=0;i<100;i++) {
				total = total+i;
			}
			System.out.println("Child thread giving notification");
			this.notify();

		}
		
	}

}

