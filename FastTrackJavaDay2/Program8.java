package com.si.day2;



public class Program8 {
	public  void foo() {
		System.out.println("Test.foo() called ");
	}
	public  void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}
	public static void main(String args[])
	{
		Program8 t1 = new Program8();
		t1.foo();
		t1.foo(10);
	}
}
