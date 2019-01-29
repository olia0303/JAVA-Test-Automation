package start;

import java.util.Scanner;
//каждый 3-й элемент умножить на 2
public class Task3 {
	public static void main(String[] args) {
		System.out.print("¬ведите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int size_mas = scanner.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 10);
			scanner.close();
			System.out.print(mas[i] + " ");
		}
		System.out.println(" ");
		int[] result;
		result = getMasMultiply(mas);
		for (int x : result)
			System.out.print(x + " ");
	}

	public static int[] getMasMultiply(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
				anyMas[i] = anyMas[i] * 2;
		}
		return anyMas;

	}

}
     
