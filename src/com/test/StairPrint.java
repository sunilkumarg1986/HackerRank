package com.test;

import java.util.Scanner;

public class StairPrint {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0;i<n;i++)
          {
            for(int j=n-1-i;j>0;j--)
            {
               System.out.print(" "); 
            }
            for(int k=0;k<=i;k++)
            {
            	System.out.print("*");
            }
            System.out.println("");
           
        }
    }
}
