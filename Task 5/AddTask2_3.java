package core;
import java.util.Scanner;
//Сортировка Шелла
public class AddTask2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 50);
			System.out.print(mas[i] + " ");
		}
		scan.close();
		printShellSortMas(mas);
		System.out.println("\nИзмененный массив:");
		for (int y : mas)
			System.out.print(y + " ");
	}
	// Сортировка Шелла
	public static void printShellSortMas(int[] anyMas) {
		// Переменная a = количество элементв массива разделенных на 2
		int a = anyMas.length / 2;
		while (a > 0) {
			for (int i = 0; i < (anyMas.length - a); i++) {
				int j = i;

				while ((j >= 0) && (anyMas[j] > anyMas[j + a])) {
					int temp = anyMas[j];
					anyMas[j] = anyMas[j + a];
					anyMas[j + a] = temp;
					j--;
				}
			}
			a = a / 2;
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	

