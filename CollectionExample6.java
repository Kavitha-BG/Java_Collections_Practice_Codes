package com.collections;

import java.util.ArrayList;

public class CollectionExample6 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10, 20, 30, 40, 50]
		
		ArrayList b = new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);//[20, 40]
		
//		al.replaceAll(99);
//		System.out.println(al);
		
		al.retainAll(b);
		System.out.println(al);//[20, 40]
	}
}
