package core;
/*. ������ n ����� � �������. ������� �� ������� �� ������, 
 * ����� ������� ������ (������) �������, � ����� �����.*/
public class Task3 {

	public static void main(String[] args) {
		String[] masStr = Starter.enterStrings();
		int averageLength = findAverageLength(masStr);
		String averageLengthText = "������� ������: ";
		System.out.println(averageLengthText + averageLength);

		for (String str : masStr) {
			if (str.length() < averageLength) {
				printMinStrLength(str);
			} else {
				printMa�StrLength(str);
			}
		}
	}

	private static int findAverageLength(String[] anyMasStr) {
		int totalLength = 0;
		for (String str : anyMasStr) {
			totalLength += str.length();
		}
		return totalLength / anyMasStr.length;
	}

	private static void printMinStrLength(String str) {
		System.out.println("������ ������ �������: " + str);
		System.out.println("����� = " + str.length());

	}

	private static void printMa�StrLength(String str) {
		System.out.println("������ ������ �������: " + str);
		System.out.println("����� = " + str.length());

	}
}