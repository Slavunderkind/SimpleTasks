
public class EvenFibonacci {
	public int getSum(int n) {
		int lastNum = 1, fibNum = 1, sum = 0;
		int num = 2;
		while (num < n) {
			if (num % 2 == 0) {
				sum += num;
			}
			fibNum = num + lastNum;
			lastNum = num;
			num = fibNum;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print(new EvenFibonacci().getSum(4000000));
	}
}
