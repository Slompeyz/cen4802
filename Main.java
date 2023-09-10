package cen4802;

public class Main {
	
	static int x = 0;
	static int y = 1;
	
	public static void main(String[] args) {
		
		int n = 10;
		fibonacci(n);
		System.out.println("Number " + n + " in the Fibonacci Sequence is: " + x);
		
	}
	
	public static void fibonacci(int n) {
		
		if(n==0) {
			System.out.println("Fibonacci method complete");
		}else {
			int z = y;
			y = x + y;
			x = z;
			fibonacci(n-1);
		}
	}
}
