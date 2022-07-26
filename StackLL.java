package com.collections;

import java.util.LinkedList;

public class StackLL {

	public static void main(String[] args) {
		
		LinkedList ll =new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println(ll);//[40, 30, 20, 10]
		
		System.out.println(ll.pop());//40
		System.out.println(ll);//[30, 20, 10]
		
		System.out.println(ll.pop());//30
		System.out.println(ll);//[20, 10]
		
		System.out.println(ll.pop());//20
		System.out.println(ll);//[10]
		
		System.out.println(ll.pop());//10
		System.out.println(ll);//[]
	}

}
