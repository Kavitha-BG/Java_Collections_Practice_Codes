package com.collections;

import java.util.ArrayList;

public class CollectionExample3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		//99 is added in 2nd position of al
		al.add(2, 99);
		System.out.println(al);
		
		ArrayList b = new ArrayList();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		System.out.println(b);
		
		//elements of b added to al in rear end
		al.addAll(b);
		System.out.println(al);
		
		//elements of b added from 2nd position
		al.addAll(2, b);
		System.out.println(al);
		
	}
}
