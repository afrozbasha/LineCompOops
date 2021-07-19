package com.LineCompOops;

import java.util.Scanner;


public class LineComp {

    public static void main(String[] args) {
	Compare p = new Compare();
	p.putValues();
	p.disp1();
	p.setLenth1();
	System.out.println("Length of a line 1: "+ p.getLenth1());
	p.disp2();
	p.setLenth2();
	System.out.println("Length of a line 2: "+ p.getLenth2());

	if (p.getcomplenth() == 0)
		System.out.println("LenthLine1 = LenthLine2");
	else if (p.getcomplenth() < 0)
		System.out.println("LenthLine1 is lessthan LenthLine2");
	else
		System.out.println("LenthLine1 is graterthan LenthLine2");

    }
}
