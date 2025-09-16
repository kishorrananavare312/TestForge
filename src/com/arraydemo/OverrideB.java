package com.arraydemo;

public class OverrideB extends OverrideA {
	
	@Override
	public int add(int a, int b) {
		
		a=a*2;
		b=b*4;
		return a+b;
	}
	
	public static void main(String[] args) {
		OverrideB b=new OverrideB();
		
		int c=b.add(2, 3);
		System.out.println(c);
	}

}
