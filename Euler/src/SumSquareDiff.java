
public class SumSquareDiff {
	long result;
	long sum;
	public long squareHundredNumbers() {
		for (int i = 1; i <= 100; i++) {
			result += i*i;
		}
		return result;
	}
	
	public long squareSum(){
		for(int i=1; i<=100; i++){
			sum += i;
		}
		return sum*sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumSquareDiff sumSquareDiff = new SumSquareDiff();
		System.out.println(sumSquareDiff.squareSum() - sumSquareDiff.squareHundredNumbers());

	}

}
