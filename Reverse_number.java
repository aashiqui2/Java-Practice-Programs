package com.practice;
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int reverse=0,rem;
		int num=sc.nextInt();
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
			
		}
		System.out.println(reverse);
		

	}

}
