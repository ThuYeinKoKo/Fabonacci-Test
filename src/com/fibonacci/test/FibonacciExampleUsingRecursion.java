package com.fibonacci.test;

import java.util.Scanner;

public class FibonacciExampleUsingRecursion {

	static int firstNum = 0;
	static int secondNum = 1;
	static int sum = 0;
	
	static void printFibonacci(int count){
		if(count>0){
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(" "+sum);
			printFibonacci(count-1);
		}
	}
	
	public static void main(String[] args) {
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		
		count = Integer.parseInt(userInput);
		
		System.out.print(firstNum+" "+secondNum);
		printFibonacci(count-2);
	}

}
