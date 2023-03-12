package com.practice;
import java.util.*;
public class Remove_space_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.replaceAll("\\s","");//remove spaces in the string
		System.out.println(str);
		System.out.println(str1);
	}

}
