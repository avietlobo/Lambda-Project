import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeTaskLambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Check if a given string is a palindrome

		System.out.println(isPalindromeUsingIntStream("madam"));
		
		//Find the 2nd biggest number in the given list of numbers
		
		List<Integer> list= Arrays.asList(1,40,400,2,22);
		Optional<Integer> output=list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
		System.out.println(output.get());
	}

	public static boolean isPalindromeUsingIntStream(String text) {
		return IntStream.range(0, text.length()/2)
				.noneMatch(i-> text.charAt(i)!=text.charAt(text.length()-i-1));
	
	}
	
	public static boolean isPalindrome(String text) {

		String orignal = text;
		char[] ch = orignal.toCharArray();
		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];

		}
		System.out.println(reverse);
		if (orignal.equalsIgnoreCase(reverse)) {
			return true;
		}

		return false;

	}

}
