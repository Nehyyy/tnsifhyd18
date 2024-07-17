package com.si.day2;

public class Program16_encapsulation {
public int age=21;
public String name="neha";
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	Program16_encapsulation p=new Program16_encapsulation();
	System.out.println(p.getAge());
	System.out.println(p.getName());
	p.setName("Vishwanath");
	System.out.println(p.getName());
}
}
