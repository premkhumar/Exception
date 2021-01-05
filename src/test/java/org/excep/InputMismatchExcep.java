package org.excep;

import java.util.Scanner;

public class InputMismatchExcep {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number : ");
			sc.nextInt();
			
		} catch (Exception e) {
			System.out.println("Invalid Input - Input Mismatch");
		}
		
	}

}
