package com.si.day2;

public class Program2 {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		boolean d;
		System.out.println("Arithmetic operators:");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+(a*b));
		System.out.println("a/b:"+(a/b));
		System.out.println("a%b:"+(a%b));
		System.out.println("Unary operators:");
		System.out.println("Increment :"+(a++));
		System.out.println("Decrement:"+(a--));
		System.out.println("Postfix:"+(b++));
		System.out.println("Prefix:"+(--b));
		System.out.println("Ternary Operators:");
		d=(a<b)?true:false;
		System.out.println("display d:"+d);
		System.out.println("Assignment Operators:");
		System.out.println("updated a value:"+(a=50));
		System.out.println(" "+(a+=1));
		System.out.println(" "+(a-=1));
		System.out.println(" "+(a*=1));
		System.out.println(" "+(a/=1));
		System.out.println(" "+(a%=1));
		System.out.println(" "+(a!=1));
		}

}
