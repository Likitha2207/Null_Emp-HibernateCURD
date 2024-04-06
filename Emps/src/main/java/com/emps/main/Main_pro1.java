package com.emps.main;

import java.util.Scanner;

public class Main_pro1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			intro();
			System.out.println("___________________");
			System.out.println("SELECT THE CHOICE:");
			int c=s.nextInt();
			start(c);
			
			
		}
	}
	public static void intro() {

		
		System.out.println("***********");
		System.out.println("*  ***     EMPS     ***  *");
		System.out.println("*********");
		
		System.out.println("1.Insert Data");
		System.out.println("2.Edit Data");
		System.out.println("3.View Data");
		System.out.println("4.Delete Data");
		System.out.println("5.Stop the Program");
		
		}



public static void start(int c) {
	switch(c){
	case 1:
		insert();
		break;
	case 2:
		edit();
		break;
	case 3:
		view();
		break;
	case 4:
		delete();
		break;
	case 5:
		System.out.println("STOP");
		System.exit(0);
		break;
	default:
		System.out.println("Enter the Valid number");
		break;
		
	}
	}
public static void insert() {
	System.out.println("Insert");
	}
public static void edit() {
	System.out.println("Edit");

}
public static void view() {
	System.out.println("View");
}
public static void delete() {
	System.out.println("Delete");
	
}


}

