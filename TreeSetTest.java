package com.collections;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts =  new TreeSet();
		ts.add(120);
		ts.add(60);
		ts.add(160);
		ts.add(30);
		ts.add(80);
		ts.add(140);
		ts.add(180);
		System.out.println(ts);//[30, 60, 80, 120, 140, 160, 180]

	}

}
