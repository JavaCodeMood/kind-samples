package com.kind.samples.patterns.singleton;

public class TestSingleton {
	// public static TestSingleton test = new TestSingleton();
	private static int count1;
	private static int count2 = 0;
	public static TestSingleton test = new TestSingleton();
	/* different position will cause different output */

	private TestSingleton() {
		count1++;
		System.out.println("count1 in constructor: " + count1);
		count2++;
		System.out.println("count2 in constructor: " + count2);
	}

	public static TestSingleton getInstance() {
		return test;
	}

	public void printCount() {
		System.out.println("count1 in printCount: " + count1);
		System.out.println("count2 in printCount: " + count2);
	}
}
