package com.session.two;

import com.session.util.Utilone;

public class Sessiontwo {
	
	public static Utilone utilAccess = new Utilone();
	
	public static void main(String args[]) {
		
//		System.out.println("test");
		int subVal = utilAccess.sub();
		System.out.println(subVal);		
		
	}

}
