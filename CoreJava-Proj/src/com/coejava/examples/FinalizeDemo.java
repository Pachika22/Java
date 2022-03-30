package com.coejava.examples;

import java.util.GregorianCalendar;

public class FinalizeDemo extends GregorianCalendar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FinalizeDemo cal = new FinalizeDemo();
		
		System.out.println(""+cal.getTime());
		
		System.out.println("Finalizing...");
		cal.finalize ();
		
		}catch(Throwable e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalized");
	}

}
