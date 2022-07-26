package com.collections;

import java.util.LinkedList;

public class LinkedListTest3 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
		
		System.out.println(ll);
//		System.out.println(ll.getFirst());//NoSuchElementException
		System.out.println(ll.peekFirst());//null
		System.out.println(ll);
	}

}
