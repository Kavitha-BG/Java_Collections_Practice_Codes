package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeueArrayStack {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		ad.push(50);
		System.out.println(ad);
		
		System.out.println(ad.pop());//50
		System.out.println(ad.pop());//40
		System.out.println(ad.pop());//30
		System.out.println(ad.pop());//20
		System.out.println(ad.pop());//10
	}

}
