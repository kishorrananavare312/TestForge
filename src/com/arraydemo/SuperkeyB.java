package com.arraydemo;

public class SuperkeyB extends Superkey {
	
	
	//Constructor can call another construtor
	public SuperkeyB()
	{
		super();
	}
	
	public void display()
	{
		int i=15;
		System.out.println(super.i);
		super.sample();
	}
	
	public static void main(String[] args) {
	
		new SuperkeyB().display();

	}

}
