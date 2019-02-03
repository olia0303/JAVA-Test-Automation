package core;
/* ������ n ����� � �������, ����� ����� �������� � ����� ������� ������.
 *  ������� ��������� ������ � �� �����.*/
public class Task1 {

	public static void main(String[] args) {

		String[] masStr = Starter.enterStrings();
		String shortStr = findShortStr(masStr);
		String longStr = findLongStr(masStr);

		String textForLenghtStr = ". ����� ������: ";
		String textForShortestStr = "����� �������� ������: ";
		String textForLongestStr = "����� ������� ������: ";

		System.out.println(textForShortestStr + shortStr + textForLenghtStr + shortStr.length());
		System.out.println(textForLongestStr + longStr + textForLenghtStr + longStr.length());
	}

	private static String findLongStr(String[] anyMasStr) {
		String longStr = anyMasStr[0];
		for (int i = 0; i < anyMasStr.length; i++) {
			if (anyMasStr[i].length() > longStr.length()) {
				longStr = anyMasStr[i];
			}
		}
		return longStr;
	}

	private static String findShortStr(String[] anyMasStr) {
		String shortStr = anyMasStr[0];
		for (int i = 0; i < anyMasStr.length; i++) {
			if (anyMasStr[i].length() < shortStr.length()) {
				shortStr = anyMasStr[i];
			}

		}
		return shortStr;
	}

}