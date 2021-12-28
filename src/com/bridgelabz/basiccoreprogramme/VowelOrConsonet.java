package com.bridgelabz.basiccoreprogramme;

import java.util.Scanner;

public class VowelOrConsonet {

	public static void main(String[] args) {
		System.out.println("Enter the Character");

		Scanner sc = new Scanner(System.in);
		char alfa = sc.next().charAt(0);
		if (alfa == 'A' || alfa == 'E' || alfa == 'I' || alfa == 'O' || alfa == 'U') {
			System.out.println("This is a Vowel");
		} else {
			System.out.println("this is Consonant");
		}
	}
}
