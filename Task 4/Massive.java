package core;
public class Massive {
	 /* метод printMassiveAsLine, который принимает в качестве аргументов массив и
	 * печатает его в консоли в одну строку, ничего не возвращает;
	 */
	public void printMassiveAsline(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
		System.out.println("  ");
	}
	/* метод printReverseMassiveAsLine, который принимает в качестве аргументов
	 * массив и печатает его в консоли в одну строку в обратном порядке, ничего не
	 * возвращает;
	 */
	public void printReverseMasssiveAsline(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		System.out.println("  ");
	}
	// метод getSumOfElements, который принимает массив, а возвращает сумму его
	// элементов;
	public int getSumofElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;
	}
	/* метод multiptyBy3, который принимает массив, умножает каждый элемент массива
	 * на 3 и возвращает умноженный массив;
	 */
	public int[] multiptyBy3(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			anyMas[i] = anyMas[i] * 3;
		}
		return anyMas;
	}

}
	
	

