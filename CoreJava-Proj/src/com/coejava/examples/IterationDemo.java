package com.coejava.examples;

public class IterationDemo {

	public static void main(String args[]) {

		for (int i = 1; i <=6; i++) {
			
			for(int j=1; j<=i ;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		for(int i = 65; i <= 68; i++)  
		{ 
			for(int j=65; j<=i; j++) {
				System.out.print((char)j+" ");
			}	
			System.out.println();
		}  
		System.out.println("---------------------");
		
		for (int i=1; i<=4; i++) {
			
			for(int j=1; j<=4 ;j++) {
				//if((i==2 && j==2)||(i==2 && j==3)||(i==3 && j==2)||(i==3 && j==3))
				if((i==2 && (j==2 || j==3))||(i==3 && (j==2 ||j==3)))
					System.out.print("  ");
				else
					System.out.print("$ ");
			}
			System.out.println();
		}
	}
	

}
