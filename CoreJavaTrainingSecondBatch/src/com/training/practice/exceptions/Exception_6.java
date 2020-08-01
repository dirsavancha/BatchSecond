package com.training.practice.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_6 {
	public static void main(String[] args) {
		while (true) {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value");
				int x = sc.nextInt();
				int y = 10 / x;
				System.out.println("Value of Y " + y);
				break;
			} catch (ArithmeticException  | InputMismatchException e) {
				System.out.println("should not Provide zero and precision value"+e);
			}
		}

	}

}
