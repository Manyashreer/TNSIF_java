package com.tns.abstractclass;

public class Circle extends
AbstractDemo{
	protected float r;
	
	@Override
	void calculate() {
		
// TODO Auto-generated method stub
		super.area=.14f*r*r;
	}
	public Circle(float r) {
		super();
		this.r=0.3f;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r +"]";
	}

}
