package com.tns.exception_handling;
import java.util.Scanner;
public class User {
	private static int age;
	static void validate() throws Age{
		System.out.println("enter age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age<18)
			throw new Age("invalid age");
	}

}
