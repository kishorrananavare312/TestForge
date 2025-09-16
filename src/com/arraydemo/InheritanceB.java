package com.arraydemo;

public class InheritanceB extends InheritanceA {
	
  
	
	public void m2()
	{
		System.out.println("I am m2 from B");
	}
	
	public static void main(String[] args) {
		
		
		InheritanceB b=new InheritanceB();
		b.m1();
		b.m2();
		//System.out.println(b.x);
	}

}
