package com.tns.abstractclass;

public class Square extends
AbstractDemo {
	protected float s;
	
public Square(float s) {
	super();
	this.s=0.2f;
	
}

      void calculate() {
      
}
     @Override
     public String toString() {
    	 return "Square [s=" + s +"]";
     }
    	 
}
