package com.practice.excrption;

public class ArrayIndexBoundExample 
{
	public static void main(String[] args) 
	{
	
		
		int arr[]=new int[6];
		arr[0]= 1;
		try
		{
		arr[6]=10;//here exception occurs 
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("this is array index out of bound exception.....");
			// TODO: handle exception
		}
		for (int i : arr)
		{
			System.out.println(i);
			
		}
		
		
	}

}
