
public class PrimeFactor {
	public Boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public int getLargest(long n) {
		int largestNum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
				largestNum = i;
			}
		}
		return largestNum;
	}

	public static void main(String[] args) {
		System.out.print(new PrimeFactor().getLargest(600851475143l));
	}

}
