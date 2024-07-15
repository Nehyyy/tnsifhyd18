package com.si.day1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		String rev=new StringBuilder(s).reverse().toString();
		System.out.println("reversed string:"+" "+rev);
		sc.close();
	}

}
