package com.project.springFramework;

public class Constructor {
	String name ="Harshith";
	String age ="27";
	
	private Constructor() {
		System.out.println("Constructor being executed");
	}
	public static void main(String[] args) {
	
		Constructor con =new Constructor();
		System.out.println("name"+con.name);
		System.out.println("name"+con.age);

		
		
	}
	

}
