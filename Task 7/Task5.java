package core;

/*¬вести n слов с консоли. Ќайти количество слов, содержащих только символы латинского алфавита, 
 * а среди них Ц количество слов с равным числом гласных и согласных букв.*/
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
		String[] masStr = Starter.enterStrings();
		ArrayList<String> strWithOnlyLatin = findStrWithOlyLatin(masStr);
		String textForOnlyLatinWords = "—лова только с латинскими буквами: ";

		System.out.println(textForOnlyLatinWords + strWithOnlyLatin.size());

		int countStrWithEqualNumberVowAndCons = findCountStrWithEqualNumberVowAndCons(strWithOnlyLatin);
		String textForCountStr = "—лова с равным числом гласных и согласных букв: ";

		System.out.println(textForCountStr + countStrWithEqualNumberVowAndCons);
	}

	private static ArrayList<String> findStrWithOlyLatin(String[] arrayWords) {
		ArrayList<String> strWithOlyLatin = new ArrayList<String>();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m;

		for (String word : arrayWords) {
			m = p.matcher(word);
			if (m.matches()) {
				strWithOlyLatin.add(word);
			}
		}
		return strWithOlyLatin;
	}

	private static int findCountStrWithEqualNumberVowAndCons(ArrayList<String> strWithOnlyLatin) {
		int countStr = 0;
		char massVowelLetters[] = { 'a', 'e', 'i', 'o', 'u', 'y' }; // ЂAї, ЂEї, ЂIї, ЂOї, ЂUї, ЂYї.
		for (String str : strWithOnlyLatin) {
			str = str.toLowerCase();
			int vowel = 0;
			int cons = 0;
			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
						|| (str.charAt(i) == 'u') || (str.charAt(i) == 'y')) {
					vowel++;
				} else
					cons++;
			}
			if (vowel == cons) {
				countStr++;
			}

		}
		return countStr;
	}
}