package com.coejava.examples.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.*;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		Stream<Integer> s = list.stream();
		
		//print even numbers using filter
		// Using filter method
		
		List<Integer> evenNumbers = s.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		// using Count method
		
		System.out.println(list.stream().filter(i->i%2==0).count());
		
		//Using map method 
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(56);
		marks.add(30);
		marks.add(40);
		marks.add(65);
		marks.add(50);
		
		System.out.println(marks);
		
		Stream<Integer> updatedMarks = marks.stream().map(i->i+5);
		System.out.println(updatedMarks.collect(Collectors.toList()));
		
		
		//using sorted method
		List<Integer> sortedList = marks.stream().sorted((L1,L2)->(L1<L2)?1:(L1>L2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Sorting alphabetical Order
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kavitha");
		names.add("Saritha");
		names.add("Lalitha");
		names.add("Sridhar");
		names.add("Siri");
		
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2= s2.length();
			
			if(l1>l2) return 1;
			else if(l1>l2) return -1;
			else return s1.compareTo(s2);
			
			
			
		};
		
		List<String> sortedNamesList = names.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(sortedNamesList);
		
		//min and max
		
		int min = list.stream().min((n1,n2)->n1.compareTo(n2)).get();
		System.out.println("min value is:"+min);
		
		int max = list.stream().max((n1,n2)->n1.compareTo(n2)).get();
		System.out.println("max value is:"+max);
		
		//for each
		System.out.println("------For each------");
		System.out.println("The Marks are:");
		
		marks.stream().forEach(System.out::println);
		
		marks.stream().forEach(i->{
			System.out.println("The square of "+i+":"+i*i);
		});
		
		}
		
	}
