import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
// Not everyone probably knows that Chef has younger brother Jeff.Currently Jeff learns to read.

// He knows some subset of the letter of Latin alphabet.In order to help Jeff to study,Chef gave him a book with the text consisting of N words.Jeff can read a word iff it consists only of the letters he knows.

// Now Chef is curious about which words his brother will be able to read,and which are not.Please help him!
public class StudyingAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		Set<Integer> knownLetters = S.chars().boxed().collect(Collectors.toSet());
		int N = sc.nextInt();
		for (int tc = 0; tc < N; tc++) {
			String W = sc.next();
			System.out.println(solve(knownLetters, W) ? "Yes" : "No");
		}
		sc.close();
	}

	static boolean solve(Set<Integer> knownLetters, String W) {
		return W.chars().allMatch(ch -> knownLetters.contains(ch));
	}
}