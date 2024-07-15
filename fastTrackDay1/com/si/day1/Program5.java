package com.si.day1;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=0,n2=1;
		System.out.println("Fibonacci series:"+n1+" "+n2);
		int next;
		while((next=n1+n2)<=n)
		{
			System.out.println(" "+next);
			n1=n2;
			n2=next;
		}
		sc.close();
		}


}
