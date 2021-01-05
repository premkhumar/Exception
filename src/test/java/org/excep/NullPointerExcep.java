package org.excep;

public class NullPointerExcep {
	
	public static void main(String[] args) {
		
		try {
			String s = null;
			char c = s.charAt(2);
			System.out.println(c);
			
			
		} catch (Exception e) {
			System.out.println("Null Pointer Exception ");
		}
	}

}
