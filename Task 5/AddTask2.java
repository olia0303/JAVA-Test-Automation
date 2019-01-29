package core;

import java.util.Scanner;
//Сортировка вставкой
public class AddTask2 {

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 20);
			System.out.print(mas[i] + " ");
		}
		scan.close();
		printInsertionSortMas(mas);
		System.out.println("\nИзмененный массив:");
		for (int x : mas)
			System.out.print(x + " ");

	}
	public static void printInsertionSortMas(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			int j, temp;
			temp = anyMas[i];
			for (j = i - 1; j >= 0 && anyMas[j] > temp; j--) {
				anyMas[j + 1] = anyMas[j];
			}
			anyMas[j + 1] = temp;

		}
		System.out.println();
	}
}


