package com.fibonacci.test;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	//Recursive Solution for Nth Fibonacci Number
	
	public static int fib(int n) {
	    if (n == 0) {
	      return 0;
	    }
	    if (n == 1) {
	      return 1;
	    }

	    return fib(n - 1) + fib(n - 2);
	  }
	
	static int fibSecondWay(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    }
	
	public static void main(String[] args) {
		int count= 0;
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		count = Integer.parseInt(userInput);
		
		int result = fibSecondWay(count);
		
		System.out.println(result);
	}
}
