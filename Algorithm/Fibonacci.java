package ch07;

public class Fibonacci {
	
	int[] value;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		value = new int[number];
	}
	
	public int fibonacciRecr(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacciRecr(n-1) + fibonacciRecr(n-2);
	}
	
	public int fibonacciRep(int n) {
		int n1 = 0;
		int n2 = 1;
		int n_cur = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for(int i = 2; i <= n; i++) {
			n_cur = n1 + n2;
			n1 = n2;
			n2 = n_cur;
		}
		return n_cur;
	}
	
	public int fibonacciMemo(int n) {
		
		int result = 0;
		value[0] = 0;
		value[1] = 1;
		
		if(n == 0) {
			return value[0];
		}
		if(n == 0) {
			return value[1];
		}
		
		for(int i = 2; i <= n; i++) {
			value[i] = value[i-1] + value[i-2];
			result = value[i];
		}
		return result;
	}

}
