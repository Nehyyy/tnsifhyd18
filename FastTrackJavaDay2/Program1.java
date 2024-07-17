package com.si.day2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String n1=scan.nextLine();
	System.out.println("Enter your last name:");
	String n5=scan.next();
	System.out.println("Enter your age:");
	int n2=scan.nextInt();
	System.out.println("Enter your GPA:");
	float n3=scan.nextFloat();
	System.out.println("Enter your cgpa");
	double n4=scan.nextDouble();
	System.out.println();
	System.out.println("Enter your mobile number:");
	BigInteger n6=scan.nextBigInteger();
	System.out.println("Enter your current Balance:");
	BigDecimal n7=scan.nextBigDecimal();
	System.out.println("Display all the details: "+n1+" "+n5+"\n "+n2+"\n "+n3+"/n "+n4+"\n "+n6+"\n "+n7);
	
}
}
