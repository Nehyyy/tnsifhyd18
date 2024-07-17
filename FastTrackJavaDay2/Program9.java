package com.si.day2;


public class Program9 {
	public static void foo() {
		System.out.println("Test.foo() called ");
	}
	public static void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}
	
	public static void foo(float b) {
		System.out.println("float value is displayed");
	}
	public static void main(String args[])
	{
		Program9.foo();
		Program9.foo(10);
		Program9.foo(12.2f);
	}
}
