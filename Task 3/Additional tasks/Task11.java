package start;

import java.util.Scanner;

public class Task11 {
//заменить все элементы массива на полусумму соседних элементов
	public static void main(String[] args) {
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
		    mas[i] = (int) (Math.random() * 40) + 10;
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int[] result;
		result = getSumMas(mas);
		 System.out.println("»зменный массив: ");
		for (int x : result)
			System.out.print(x + " ");
		scan.close();
	}
	public static int[] getSumMas(int[] anyMas) {
		for (int i = 1; i < anyMas.length - 1; i++) {
			anyMas[i] = (anyMas[i - 1] + anyMas[i + 1]) / 2;
		}
		return anyMas;
	}

}
		                                    
		  
         
     

       

