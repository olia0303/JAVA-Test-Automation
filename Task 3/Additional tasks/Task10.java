package start;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// проверить, €вл€етс€ ли массив возрастающей последовательностью (каждое
		// следующее число больше предыдущего)
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 50) + 10;

		System.out.print(mas[i] + " ");
		}
		System.out.print(" ");
		printMasMultiply(mas);
		scan.close();
	}
		public static void printMasMultiply(int[] anyMas)
		 {
		   boolean flag = true;
		   for (int i = 0; i < anyMas.length; i++) {
		   if (anyMas[i] <= anyMas[i + 1]) {
		   flag = false;
		   break;
			}
		}
		if (flag) {
			System.out.println("\nћассив €вл€етс€ строго возрастающей последовательностью");
		} else {
			System.out.println("\nћассив не €вл€етс€ строго возрастающей последовательностью");
		}
	    }
}




