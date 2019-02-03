package core;
/*. Ввести n строк с консоли. Вывести на консоль те строки, 
 * длина которых меньше (больше) средней, а также длину.*/
public class Task3 {

	public static void main(String[] args) {
		String[] masStr = Starter.enterStrings();
		int averageLength = findAverageLength(masStr);
		String averageLengthText = "Средняя длинна: ";
		System.out.println(averageLengthText + averageLength);

		for (String str : masStr) {
			if (str.length() < averageLength) {
				printMinStrLength(str);
			} else {
				printMaхStrLength(str);
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
		System.out.println("Строка меньше средней: " + str);
		System.out.println("Длина = " + str.length());

	}

	private static void printMaхStrLength(String str) {
		System.out.println("Строка больше средней: " + str);
		System.out.println("Длина = " + str.length());

	}
}