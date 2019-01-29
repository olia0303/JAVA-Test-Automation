package start;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
// пройти по массиву, вывести все элементы в прямом и в обратном порядке
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 10);
		}
		printReverseMas(mas);
		System.out.print("\nМассив в обратном порядке: " + " ");
		printDirectMas(mas);
		scan.close();
	}

	public static void printDirectMas(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
	}

	public static void printReverseMas(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}

	}
}
