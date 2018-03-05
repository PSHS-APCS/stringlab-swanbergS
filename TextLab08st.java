//Sophia Swanberg
//100 Point Version 
//APCS Period 1
//5 March 2018

import java.util.Scanner;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("TextLab08\n\n");
		FullName fn = new FullName();
		System.out.println("\nFirst Name First: " + fn.firstNameFirst());
		System.out.println("\nLast  Name First: " + fn.lastNameFirst());
		System.out.println();
	}
}

class FullName
{
	String name;

	public FullName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name, first name first.  -->  ");
		name = input.nextLine();
	}

	public String firstNameFirst()
	{
		return name;
	}

	public String lastNameFirst()
	{	
		String firstName = name.substring(0, name.lastIndexOf(" ")); //grabs the first index of the string
																	 //up to the last instance of a space
		
		String lastName = name.substring(name.lastIndexOf(" ")); //grabs the string after the last instance
																 //of a space 
		return lastName + ", " + firstName;
	}
	
	
}

