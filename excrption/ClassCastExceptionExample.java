package com.practice.excrption;

class Airport
{
	void export()
	{
		System.out.println("exports two things...");
	}
}
class Cargo extends Airport
{ 
	void volumecapsity() {
		System.out.println("33300 cobic tones ");
	}
	
}
class Passenger extends Airport
{
	void noofseats()
	{
		System.out.println("10000  ");
	}
}
public class ClassCastExceptionExample 
{
	public static void main(String[] args) 
	{
		
		Airport a1 = new Cargo();
		Cargo anthov = (Cargo) a1;
		anthov.export();
		
		Airport a2 = new Passenger();
		try
		{
		Cargo boing  = (Cargo) a2; 
		}
		catch (ClassCastException e) 
		{
			System.out.println("this is class cast exception....");
			System.out.println("Passenger cannot be cast to class Cargo");
			// TODO: handle exception
		}
				
		System.out.println("code after exception.....");
		Object age = new Integer(18);
		try {
			String k = (String) age;
			System.out.println(k);
			
			
			
		} catch (ClassCastException s) {
			System.out.println("this is another class cast exception.....");
		}
		
		
	}

}
