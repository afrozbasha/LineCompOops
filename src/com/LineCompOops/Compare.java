package com.LineCompOops;

import java.util.Scanner;

public class Compare {
    static int x1, x2, x3, x4, y1, y2, y3, y4;
    static double lenth1, lenth2;

    public void putValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x2: ");
        x2 = sc.nextInt();
        System.out.print("Enter x1: ");
        x1 = sc.nextInt();

        System.out.print("Enter y2: ");
        y2 = sc.nextInt();
        System.out.print("Enter y1: ");
        y1 = sc.nextInt();


        System.out.print("Enter x4: ");
        x4 = sc.nextInt();
        System.out.print("Enter x3: ");
        x3 = sc.nextInt();

        System.out.print("Enter y4: ");
        y4 = sc.nextInt();
        System.out.print("Enter y3: ");
        y3 = sc.nextInt();

    }

    public void disp1() {
        System.out.println("A Length as 2 points : " + "(" + x1 + "," + y1 + ")" + "and" + "(" + x2 + "," + y2 + ")");
    }

    public void disp2() {
        System.out.println("A Length as 2 points : " + "(" + x3 + "," + y3 + ")" + "and" + "(" + x4 + "," + y4 + ")");
    }

    public void setLenth1(){
        lenth1 = Math.sqrt((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
    }
    public double getLenth1(){
        return lenth1;
    }
    public void setLenth2(){
        lenth2 = Math.sqrt((x4 - x3) * (x4-x3)) + ((y4-y3) * (y4-y3));
    }
    public double getLenth2(){
        return lenth2;
    }
    public int getcomplenth(){
        if (Double.compare(lenth1, lenth2) == 0)
            return 0;
        else if(Double.compare(lenth1, lenth2) <0)
            return -1;
        else
            return 1;
    }

}
