package com.si.day2;

public class Program18_multipleinheritance extends Program18_2 implements Program18_1{

	String language = "Java";

	  // implement method of interface
	  public void connectServer() {
	    System.out.println(language + " can be used as backend language.");
	  }

	  public static void main(String[] args) {
		  Program18_multipleinheritance java = new Program18_multipleinheritance();

	    java.connectServer();
	    java.responsive(java.language);

	}

}
