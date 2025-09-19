package com.tns.overloading;

public class Point {
	private float x;
	private float y;
	
	
	public Point() {
		x=0.0f;
		y=0.0f;
		
//TODO Auto-generated constructor stub
	}
	public Point(float x) {
		this.x=x;
		
	}
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point [x="+x+",y="+y+"]";
	}

}
