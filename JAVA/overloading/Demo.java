package com.tns.overloading;

public class Demo {
	public static void main(String [] args) {
		Point pone=new Point();
		System.out.println(pone);
		Point ptw=new Point(0.2f);
		System.out.println(ptw);
		Point p=new Point(0.2f,0.5f);
		System.out.println(p);
	}

}
