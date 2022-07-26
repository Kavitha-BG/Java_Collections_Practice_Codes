package com.collections;

import java.util.ArrayList;

public class AddSet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		al.add(2, 99);
		System.out.println(al);
		
		al.set(2, 100);
		System.out.println(al);
	}

}
