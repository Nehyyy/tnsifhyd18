package com.si.day1;
import java.util.Scanner;
public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
	    int sum=0;
	    while(n!=0)
	    {
	    	sum+=n%10;
	    	n/=10;
	    }
	    System.out.println("sum="+" "+sum);
	    sc.close();
	}


}
