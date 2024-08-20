package PAGES;

import java.util.ArrayList;

public class TEST {
	
	public static void main(String[] args) 
	{
		int num =12345678, reverse=0;
	  int a[]={1,2,3,4,5,6,7,8,9,10}; 
	  int[] arr = {50,30,20};
	  ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) 
			   {
		System.out.println(a[i]);  
		list.add(a[i]);
		       }  
        }  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2==0)
			{  
		System.out.println(a[i]);
		list.add(a[i]);
			} 
		}
	}}
