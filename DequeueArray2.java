package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeueArray2 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad);
		
		System.out.println(ad.pollLast());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollLast());
	}

}
