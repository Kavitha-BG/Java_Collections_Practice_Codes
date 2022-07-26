package com.collections;

import java.util.ArrayList;

public class CollectionExample5 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10, 20, 30, 40, 50]
		
		al.remove(2); //remove from index value
		System.out.println(al);//[10, 20, 40, 50]
		
		al.remove(new Integer(50));
		System.out.println(al);//[10, 20, 40]
		
		ArrayList b = new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);//[20, 40]
		
		al.removeAll(b);
		System.out.println(al);//[10]
		
		al.clear();
		System.out.println(al);//[]
		
	}
}
