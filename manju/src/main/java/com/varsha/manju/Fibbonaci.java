package com.varsha.manju;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Fibbonaci {

	static int a1=0, a2=1, a3=0;
	private Map<Integer, Integer> cache = new ConcurrentHashMap<>(20);
	public static void main(String[] args) {
		printFibbonaci(10);
		int cnt = 10;
		
		System.out.println(a1 + "" + a2);
		FibbonaciRecursion(cnt-2);
		
		int nThfibonacciNo = new Fibbonaci().fibonacci(5); 
	      System.out.println(nThfibonacciNo);
		

	}
	
	static void printFibbonaci(int count){
		
		int n1=0,n2=1,n3,i;
		System.out.println(n1 + "" + n2);
		for(i=2;i<count;++i){
			n3 = n1+n2;
			System.out.println("" + n3);
			n1=n2;
			n2=n3;
		}
		System.out.println("compleate");
	}
	
	//Recursive way
		
		static void FibbonaciRecursion(int count1){	
			if(count1>0){		
				
				a3 = a1+a2;
				a1 = a2;
				a2 = a3;
				System.out.println("" + a3);
				FibbonaciRecursion(count1-1);
			}
		}
		
	//improve the performance by caching and java8 functional programming
		
		public int fibonacci(int n) {
		    if (n == 0 || n == 1)
		      return n;
		 
		    return cache.computeIfAbsent(n, (key) -> {
		            System.out.println("evaluating fib(" + n + ")");
		            return fibonacci(n - 2) + fibonacci(n - 1);
		        });
		  }

}
