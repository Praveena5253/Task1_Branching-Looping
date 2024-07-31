package com.task1;

import java.util.Scanner;

public class PurchaseDiscount {
	public static void main(String[] args) {
		int amt=0, pamt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		pamt=s.nextInt();
		if(pamt < 500)
			amt = pamt;
		else if(pamt >=500 && pamt <= 1000)
			amt = pamt - (pamt * 10)/100;
		else if(pamt > 1000)
			amt = pamt - (pamt * 20)/100;
		System.out.println("\nAmount to pay: " + amt);
	}
}
