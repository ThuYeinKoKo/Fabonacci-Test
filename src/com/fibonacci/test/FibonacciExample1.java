package com.fibonacci.test;

import java.util.Scanner;

public class FibonacciExample1 {
	
	static int firstNum = 0;
	static int secondNum = 1;
	static int sum = 0;
	
	static void printFibonacci(int count){
		for(int i=2; i<count; i++)//loop starts from 2 because firstNum and secondNum are already printed    
		 {    
			 sum = firstNum+secondNum;   
			 firstNum = secondNum;    
			 secondNum = sum;    
			 
			 System.out.print(" "+sum); 
		 }
	}

	public static void main(String[] args) {
		
		int count= 0;    
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		
		count = Integer.parseInt(userInput);
		System.out.print(firstNum+" "+secondNum);//printing firstNum and secondNum    
		
		printFibonacci(count);
		
		
		
	}

}
