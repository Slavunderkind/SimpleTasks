//product of two 3-digit numbers	
public class Palindrome {
	public String reverseMe(String argument) {
		StringBuilder sb = new StringBuilder();
		for (int i = argument.length() - 1; i >= 0; i--) {
			sb.append(argument.charAt(i));
		}
		return sb.toString();
	}

	public boolean isPalindrome(int number) {
		String numbers = "" + number;
		if ((reverseMe(numbers)).equals(numbers)) {
			return true;
		}
		return false;
	}

	public long getLargestPalindrome() {
		int leftMultiplier = 999;
		long result = 999 * 999;
		int answer = 0;
		while (leftMultiplier > 99) {
			int rightMultiplier = 999;
			if (result == (int) result) {
				while (rightMultiplier > 99) {
					result = leftMultiplier * rightMultiplier;
					if (isPalindrome((int) result) && result > answer) {
						answer = (int) result;
						System.out.print("Result is " + result + "\n");
					}
					rightMultiplier--;
				}
			}
			leftMultiplier--;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.print(new Palindrome().getLargestPalindrome());
	}
}

// 997 998 996 997
