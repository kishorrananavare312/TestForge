package com.arraydemo;

import java.util.Iterator;

public class MyClass {

	public static void main(String[] args)	{
	/*int [] x = {32,19,65,53,94,10};
	
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if(x[i] > x[j])
				{
				int temp;
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}		
			}
		}
		for (int element :x)
		{
			System.out.printf(element +"," );
		}*/
		
		
//----------------------------------------------//Duplicate---------------------------------------------
		//eg-1
		
		/*int [] x = {10,52,94,53,94,10};
		for(int i=0;i<=x.length;i++)
		{
			for (int j =i+1 ; j < x.length; j++) 
			{
				if(x[i]==x[j])
				{
				int temp;
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				System.out.println(temp);
				}
				
			}
		}/*
		

		
	//examp2
			
		/*int [] x = {32,53,65,53,94,10};
		for(int i=0;i<=x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[i]);
				}break;
			}
		}*/
		
		int [] x = {1,3,5,10,11,13};
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%x[i]==0)
			{
				System.out.println(x[i]);
			}
		}
		
	}
}
	
//--------------------------------reverse array------------------------------------------		
		/*int [] x = {32,19,65,53,94,10};
		//int j=0;
		for(int i=x.length-1; i>=0; i--)
		{
			System.out.print(x[i]+ ",");
			//j++;
		}/*
		
		
		
	
	
	
	
	
	
	
	
	
	/*{
		int [] x = {10,24,35,44,59,56};
		int j=5;
		int k=0;
		for (int i = 0; i < 3; i++) {
			System.out.print(x[k]+",");
			k++;
		}
		for (int i = 0; i <3 ; i++) {
			System.out.println();
			System.out.println(x[j]);
			j--;
		}
		
	}*/
	
	

