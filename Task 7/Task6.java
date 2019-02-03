package core;
/*¬вести n слов с консоли. Ќайти слово, символы в котором идут в строгом пор€дке возрастани€ их кодов. 
 ≈сли таких слов несколько, найти первое из них.*/
public class Task6 {

	public static void main(String[] args) {
		String[] masWords = Starter.enterStrings();

		for (String word : masWords) {
			int temp = 0;
			for (int i = 0; i < word.length() - 1; i++) {
				int charCode = word.charAt(i);
				int nextCharCode = word.charAt(i + 1);

				if (nextCharCode < charCode) {
					break;
				} else
					temp++;

				if (temp == word.length() - 1) {
					System.out.println("Ёто слово : " + word);
					return;
				}

			}
		}
	}
}