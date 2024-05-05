package com.si.sample;

public class Car2Parameterized {
public Car2Parameterized(String doors,String driver,String engine, int speed) {
	doors="closed";
	engine="on";
	driver="seated";
	speed=26;
}
public void run() {
	System.out.println("Running");
}
}
