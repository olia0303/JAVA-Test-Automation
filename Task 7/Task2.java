package core;
/*Ввести n строк с консоли. Упорядочить и вывести строки
 * в порядке возрастания (убывания) значений их длины. */
public class Task2 {

	public static void main(String[] args) {

		String[] masStr = Starter.enterStrings();
		System.out.println("В порядке возрастания:");   
		String[] arrayStrSortAsc = sortArrayStrAscending(masStr);
		Starter.printStringArray(arrayStrSortAsc);
		System.out.println("В порядке убывания:");
		String[] arrayStrSortDesc = sortArrayStrDescending(masStr);
		Starter.printStringArray(arrayStrSortDesc);

	}

	private static String[] sortArrayStrAscending(String[] anyMasStr) {
		for (int i = 0; i < anyMasStr.length; i++) {
			String temp;
			for (int j = 0; j < anyMasStr.length - 1 - i; j++) {
				if (anyMasStr[j].length() > anyMasStr[j + 1].length()) {
					temp = anyMasStr[j];
					anyMasStr[j] = anyMasStr[j + 1];
					anyMasStr[j + 1] = temp;
				}
			}
		}

		return anyMasStr;
	}

	private static String[] sortArrayStrDescending(String[] anyMasStr) {
		for (int i = 0; i < anyMasStr.length; i++) {
			String temp;
			for (int j = 0; j < anyMasStr.length - 1 - i; j++) {
				if (anyMasStr[j].length() < anyMasStr[j + 1].length()) {
					temp = anyMasStr[j];
					anyMasStr[j] = anyMasStr[j + 1];
					anyMasStr[j + 1] = temp;
				}
			}
		}
		return anyMasStr;
	}
}
