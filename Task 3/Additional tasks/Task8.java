package start;
import java.util.Scanner;
public class Task8 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 20) + 10;
			System.out.print(mas[i] + " ");
		}
		scan.close();
		System.out.println("\nМинимальный элемент: ");
		int result = getMasMin(mas);
		System.out.print(result);
		System.out.println("\nМаксимальный элемент: ");
		int result1 = getMasMin(mas);
		System.out.print(result1);
	}

	public static int getMasMin(int[] anyMas) {
		int min = anyMas[0];
		for (int i = 0; i < anyMas.length; i++) {
			if (min > anyMas[i])
				min = anyMas[i];
		}
		return min;
	}
	public static int getMasMax(int[] anyMas) {
		int max = anyMas[0];
		for (int i = 0; i < anyMas.length; i++) {
			if (max < anyMas[i])
				max = anyMas[i];
		}
		return max;
	}
}