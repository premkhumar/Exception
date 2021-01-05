package org.excep;

public class ArithmeticException {
	
	public static void main(String[] args) {
		try {
			
			System.out.println(4/0);
		} catch (Exception e) {
			
			System.out.println("Its not Possible");
			
		}
		
		
	}
}
