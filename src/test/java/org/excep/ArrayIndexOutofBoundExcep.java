package org.excep;

public class ArrayIndexOutofBoundExcep {
	
	public static void main(String[] args) {
		try {
			
			int a[] =  new int[5];
			
			a[0]=5;
			a[1]=10;
			a[2]=15;
			a[3]=20;
			a[4]=25;
			System.out.println(a[1]);
			a[5]=30;
			
		} catch (Exception e) {
			System.out.println("Array Index out of Bound Exception");
		}
		
		
	}

}
