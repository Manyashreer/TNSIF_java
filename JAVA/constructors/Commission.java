package com.tns.constructors;
import java.util.Scanner;
public class Commission {
	String name;
  String address;
  String phone;
  double sales_amount;
  
  Commission(){
	  System.out.println("Employee object is created");
  }
  
  void acceptDetails() {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter name:");;
	  name = sc.nextLine();
	  System.out.print("enter address:");
	  address = sc.nextLine();
	  System.out.print("enter phone:");
	  phone = sc.nextLine();
	  System.out.print("enter sales amount:");
	  sales_amount = sc.nextDouble();
	  sc.close();
  }
  
  void calcuateCommission() {
	double commission = 0;
	
	if (sales_amount >=100000) {
		commission = sales_amount * 0.10;
	} else if (sales_amount >= 50000) {
		commission = sales_amount * 0.05;
	} else if (sales_amount >= 30000) {
		commission = 0;
	}
	
	System.out.println("\n---Commission Report---");
	System.out.println("Employee Name: " + name);
	System.out.println("Sales Amount: " + sales_amount);
	System.out.println("Commission: " + commission);
	
  }
  
  public static void main(String [] args) {
	  Commission emp = new Commission ();
	  emp.acceptDetails();
	  emp.calcuateCommission();
  }

}
