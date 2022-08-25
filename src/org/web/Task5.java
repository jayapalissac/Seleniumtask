package org.web;

import java.io.FileNotFoundException;

public class Task5 {
	
	public static void main(String[]args)throws Exception {
		 Thread.sleep(3000);
		try {
			
			throw new NullPointerException();
			
			//try {
				//throw new StringIndexOutOfBoundsException();
			//}
			//catch(Exception e) {
		//	String a1 =	e.toString();
			//System.out.println(a1);
		//		System.out.println("Wrong calling"); 	
		//	}
		//	finally {
			//	System.out.println("Exit");
			//}
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("AlphaNumeric text is present");
		}
	finally {
		System.out.println("End");
	}
}
}
