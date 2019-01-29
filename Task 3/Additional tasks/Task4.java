package start;

import java.util.Scanner;

public class Task4 {
//найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 5);
			System.out.println(mas[i]);
		}
		System.out.print(" ");
		printMasMultiply(mas);
		scan.close();
	}

	public static void printMasMultiply(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0)
				count++;
			}
		if (count != 0) {
			System.out.println("\nКоличество нулевых элементов:" + count + " ");
		} else {
			System.out.println("\nНулевых элементов нет");
		}
		
	}
}
	