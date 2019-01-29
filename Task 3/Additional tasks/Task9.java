package start;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
//найти номер минимального-максимального элементов и вывести
		System.out.print("Введите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int size_mas = scanner.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 20);
			System.out.print(mas[i] + " ");
		}
		System.out.println("\nНомер минимального элемента: ");
		scanner.close();
		int result = getMasMin(mas);
		System.out.print(result);
		System.out.println("\nНомер максимального элемента: ");
		int result1 = getMasMax(mas);
		System.out.print(result1);
	}
	public static int getMasMin(int[] anyMas) {
		int min = anyMas[0];
		int index_min = 0;
		for (int i = 1; i < anyMas.length; i++) {
			if (min > anyMas[i]) {
				min = anyMas[i];
				index_min = i;
			}
		}
		return index_min;
	}
	public static int getMasMax(int[] anyMas) {
		int index_max = 0;
		int max = anyMas[0];
		for (int i = 1; i < anyMas.length; i++) {
			if (max < anyMas[i]) {
				max = anyMas[i];
				index_max = i;
			}
		}
		return index_max;
	}
}
