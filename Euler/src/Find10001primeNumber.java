import java.util.ArrayList;
import java.util.List;

public class Find10001primeNumber {
	List<Integer> primers = new ArrayList<Integer>();

	public Boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	List<Integer> setArrayWithPrimers() {
		for (int i = 2; i <= 110000; i++) {
			if (isPrime(i)) {
				primers.add(i);
			}
		}
		return primers;
	}

	public static void main(String[] args) {
		int desireIndex = 10001;
		System.out.println(new Find10001primeNumber().setArrayWithPrimers().get(desireIndex - 1));
	}

}
