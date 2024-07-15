package com.si.day1;
import java.util.Scanner;
public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swapping:");
		System.out.println("first num="+" "+n1);
	
		System.out.println("second num="+" "+n2);
		sc.close();
	}
}
