package com.si.day2;

public class Program4 {
	public static void main(String[] args) {
		Program3 id = new Program3();
		id.callme();
		System.out.println("The value of a = " + Program3.a);
		Program3.call();
		System.out.println("The value of b = " + id.b);
	}

}
