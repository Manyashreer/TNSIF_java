package com.tns.exception_handling;

public class Exec {
	public static void main(String [] args) {
		try {
			User.validate();
		}
		catch(Age e)
		{
			System.out.println("caught exception"+e.getMessage());
		}
	}

}
