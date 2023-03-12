package com.practice;
import java.util.*;
public class Fibonacci {
	static int a=0,b=1,c;
	static void fibonaci(int n) {
		if(n>0) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibonaci(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0,b=1,n=8,c=0;
//		System.out.println(a);
//		System.out.println(b);
//		for(int i=2;i<n;i++) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		System.out.println(0);
		System.out.println(1);
		fibonaci(a-2);

	}

}
