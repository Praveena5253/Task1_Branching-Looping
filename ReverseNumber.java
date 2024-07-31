package com.task1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, rem, quo, rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=s.nextInt();
		System.out.println("\nGiven number: " + n);
		while(n > 0) {
			rem = n%10;
			rev = (rev * 10) + rem;
			n = n/10;
		}
		System.out.println("\nReverse of the number: " + rev);
	}

}
