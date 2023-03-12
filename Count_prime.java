package com.practice;
import java.util.*;
public class Count_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		int j=0,i;
		for(i=start;i<=end;i++)
		{
		for(j=2;j<i;j++)
		{
			if(i%j==0) {
				break;
			}
		}
		if(i==j) {
		
			count++;
			
		}
		System.out.println(j);
		}
		System.out.println(i);
		System.out.println(count);
		System.out.println(Math.sqrt(4));

	}

}
