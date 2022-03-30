package com.corejava.collection.curosor.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for(int i=0;i<=10;i++) {
			al.add(i);
			
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			if((Integer)itr.next() % 2 != 0) {
				itr.remove();
			}
		}
		System.out.println("After Iterator:"+al);
		
	}

}
