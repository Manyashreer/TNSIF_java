package com.tns.access_specifier;

public class Student {
	private String name;
  private int marks;
  
  public Student(String name,int marks) {
	  this.name = name;
	  this.marks = marks;
	  System.out.println("Parameterized Constructor.");
  }
  
  public Student() {
	  this.name = "Unknown";
	  this.marks = marks;
	  System.out.println("Default Constructor.");
  }
  
  public String getName() {
	  return name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public int getMarks() {
	  return marks;
  }
  
  public void setMarks(int marks) {
	  this.marks = marks;
  }
  @Override
  public String toString() {
	  return "Studenr [name=" +name +",marks=" + marks +"]";
  }
}
