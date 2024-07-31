package com.task1;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		int n1, n2, n3, sn, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		n1=s.nextInt();
		System.out.println("Enter the second number: ");
		n2=s.nextInt();
		System.out.println("Enter the third number: ");
		n3=s.nextInt();
		temp = (n1 < n2) ? n1 : n2;
		sn = n3 < temp ? n3 : temp;
		System.out.println("\nThe smallest number is: " + sn);
	}

}
