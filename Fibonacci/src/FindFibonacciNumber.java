import java.util.Scanner;

public class FindFibonacciNumber {

	static boolean isPerfectSquare(int number) {
		int x = (int) Math.sqrt(number);
		return (x * x == number);
	}

	static boolean isFibonacci(int num) {
		return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
	}

	public static void main(String[] args) {
		System.out.println("Input the number ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		if (isFibonacci(num)) {
			System.out.println(num + " is a Fibonacci number");
		}
		else {
			System.out.println(num + " is not a Fibonacci number");
		}
	}
}
