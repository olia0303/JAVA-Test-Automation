package start;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		// пройти по массиву и помен€ть местами первый и последний, второй и
		// предпоследний и т.д
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 25);
			System.out.print(mas[i] + " ");
		}
		System.out.print(" ");
		printMasMultiply(mas);
		System.out.println("\n»змененный массив:");
		for (int x : mas)
			System.out.print(x + " ");
	
		scan.close();
	}
		 public static void printMasMultiply(int[] anyMas)
		 {
		  for (int i = 0; i < anyMas.length; i++) {
            
			int temp = anyMas [0];                 
			anyMas [0] = anyMas [anyMas.length - 1];
			anyMas [anyMas.length - 1] = temp;
	        
	        int temp1 = anyMas[1];
	        anyMas[1] = anyMas[anyMas.length - 2];
	        anyMas[anyMas.length - 2] = temp1;
		}
		  System.out.println();
		
	}
}