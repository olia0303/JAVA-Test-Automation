package start;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// пройти по массиву и помен€ть местами каждые 2 соседних элемента
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 50);
			System.out.print(mas[i] + " ");
		}
		System.out.println("\n»змененный массив: ");
		scan.close();
		printMasMultiply(mas);
		for (int x : mas)
			System.out.print(x + " ");
	}

	 public static void printMasMultiply(int[] anyMas) {
		for (int i = 0; i < anyMas.length - 1; i++) {
			int temp = anyMas[i];
			anyMas[i] = anyMas[i + 1];
			anyMas[i + 1] = temp;
		}
		System.out.println();
	}
}
