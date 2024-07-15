package com.si.day1;
import java.util.Scanner;
public class Program11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double avg=(n1+n2)/2;
		System.out.println("average="+avg);
		sc.close();
	}


}
