package org.excep;

public class StringIndexOutOfBoundExcep {
	
	public static void main(String[] args) {
		try {
			
			String s = "prem";
			//	0123
			System.out.println(s.charAt(2));
			System.out.println(s.charAt(4));
			System.out.println(s.charAt(1));
			
		} 
		catch(Exception e){
			System.out.println("indexout of bound");
		}
		
		
		finally {
			System.out.println("Always Execute");
		}
		
	}

}
