//		Complexity: O(n) time

package Day2;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int last = 0;
		int current = 1;
		int temp;

		for (int i = 2; i <= num; i++) {
			temp = current;
			current = last + current;
			last = temp;
		}

		System.out.println("Fibonacci of number " + num + " is: " + current);
		System.out.println("Fibonacci of number " + num + " is: " + fibo(num));
		System.out.println("Fibonacci of number " + num + " is: " + binaryFibo(num));

	}

	public static int fibo(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}
	
	public static int binaryFibo(int num) {
		int temp;
		if (num == 0) 
			return 0;
		else if (num == 1) 
			return 1;
		else if (num == 2) 
			return 1;
		else if (num % 2 == 0) {
			temp = num/2;
			return 2*binaryFibo(temp)*binaryFibo(temp + 1) - binaryFibo(temp)*binaryFibo(temp);
		}
		else {
			temp = (num - 1)/2;
			return binaryFibo(temp)*binaryFibo(temp) + binaryFibo(temp+1)*binaryFibo(temp+1);
		}
	}

}
