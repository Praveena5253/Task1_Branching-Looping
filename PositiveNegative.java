package com.task1;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: "); 
		num = s.nextInt();
		if(num > 0)
			System.out.println("The given number " + num + " is positive");
		else if(num < 0)
			System.out.println("The given number " + num + " is negative");
		else
			System.out.println("The given number is zero");
	}
}





