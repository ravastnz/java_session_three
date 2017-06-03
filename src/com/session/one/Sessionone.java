package com.session.one;

import com.session.util.Utilone;

public class Sessionone {
	
	public static Utilone utilAccess = new Utilone();
	
	public static void main(String args[]) {
		
//		System.out.println("test");
		int sumVal = utilAccess.add();
		System.out.println(sumVal);		
		System.out.println(utilAccess.b);
		
	}

}
