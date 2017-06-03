package com.session.two;

import com.session.util.Utilone;

public class Testsession extends Utilone {
	
	int x;

	Testsession(int x) {
		
		this.x = x;
//		y = "admin";
		
//		System.out.println(x);
//		System.out.println(y);
		
	} 
	
	void disp() {
		
		System.out.println(x);
		
	}
	
	public static void main(String args[]) {
		
		Testsession ts = new Testsession(2);
		
		ts.disp();
//		System.out.println(ts.x);
//		System.out.println(ts.y);
		
	}

}
