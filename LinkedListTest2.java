package com.collections;

import java.util.LinkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addLast(60);
		System.out.println(ll);//[50, 40, 10, 20, 30, 60]

		System.out.println(ll.getFirst());//50
		System.out.println(ll.getLast());//60
		
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		
		System.out.println(ll.peekLast());
		System.out.println(ll);//[40, 10, 20, 30, 60]
		System.out.println(ll.pollLast());
		System.out.println(ll);//[40, 10, 20, 30]
		
	}

}
