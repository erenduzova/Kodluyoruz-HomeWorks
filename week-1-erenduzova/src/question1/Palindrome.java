package question1;

import java.util.ArrayList;

public class Palindrome {

	public static void main(String[] args) {

		ArrayList<Long> longestChain = new ArrayList<>();
		ArrayList<Long> chain = new ArrayList<>();

		Long rNumber;
		Long tmpNumber;

		// Loop for finding the longest chain
		for (Long number = 10L; number <= 100L; number++) {
			// Clear chain for new number
			chain.clear();
			// add number as first element of chain
			chain.add(number);

			tmpNumber = number;
			rNumber = reverseNum(tmpNumber);

			// Is tmpNumber palindrome
			while (!(tmpNumber.equals(rNumber))) {
				
				// Stop loop after 30. iteration to prevent infinite loop
				if (chain.size() >= 30) {
					chain.clear();
					break;
				}
				
				tmpNumber += rNumber;
				chain.add(tmpNumber);
				rNumber = reverseNum(tmpNumber);
			}

			// Is chain longer than longest
			if (chain.size() > longestChain.size()) {
				longestChain = new ArrayList<Long>(chain);
			}

		}
		// print answer
		System.out.println("Longest Chain = " + longestChain + "\n" + "Number = " + longestChain.get(0)
				+ "\nIterations= " + (longestChain.size() - 1));
	}

	// Returns reversed number
	public static Long reverseNum(Long num) {
		Long reverse = 0L;
		while (num > 0L) {
			Long remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		return reverse;

	}

}
