package core;
/*Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
Если таких слов несколько, найти первое из них.*/

public class Task4 {

	public static void main(String[] args) {

		String[] masStr = Starter.enterStrings();
		String strWithDiffValue = findStrWithDiffValue(masStr);
		String textStrWithDiffValue = "Cлово, в котором число различных символов минимально: ";

		System.out.println(textStrWithDiffValue + strWithDiffValue);

	}

	private static String findStrWithDiffValue(String[] anyMasStr) {
		int diffValue = anyMasStr[0].length();
		String strWithDiffValue = anyMasStr[0];
		for (int i = 0; i < anyMasStr.length; i++) {
			if ((int) anyMasStr[i].chars().distinct().count() < diffValue) {
				diffValue = (int) anyMasStr[i].chars().distinct().count();
				strWithDiffValue = anyMasStr[i];
			}
		}
		return strWithDiffValue;
	}

}