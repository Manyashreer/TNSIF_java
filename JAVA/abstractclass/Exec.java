package com.tns.abstractclass;

public class Exec {
	public static void main(String [] args) {
		AbstractDemo d;
		d=new Square(0.2f);
		d.calculate();
		d.display();
		d=new Circle(0.1f);
		d.calculate();
		d.display();
	}

}
