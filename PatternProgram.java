package com.task1;

public class PatternProgram {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {

			for (int j = 5; j > i; j--) {
				System.out.print(j + " ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(i + " ");
			}  
			System.out.println();
		}
	}
}

