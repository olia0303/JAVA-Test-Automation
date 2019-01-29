package core;
import java.util.Scanner;
//Сортировка слиянием
public class AddTask2_2 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; ++i) {
			mas[i] = (int) (Math.random() * 50);
			System.out.print(mas[i] + " ");
		}
		scan.close();
		mas = MergeSort(mas);
		System.out.println();
		for (int x : mas)
			System.out.print(x + " ");
	}
	public static int[] MergeSort(int[] mas) {
		if (mas.length == 1)
			return mas;
		else {
			int n = (int) Math.floor(mas.length / 2);
			int mas2[] = new int[n];
			int mas3[] = new int[mas.length - n];
			int i;
			for (i = 0; i < mas.length; ++i) {
				if (i < n)
					mas2[i] = mas[i];
				else
					mas3[i - n] = mas[i];
			}
			mas2 = MergeSort(mas2);
			mas3 = MergeSort(mas3);
			mas = Merge(mas2, mas3);
			return mas;
		}
	}
	public static int[] Merge(int[] mas, int[] mas2) {
		int mas3[] = new int[mas.length + mas2.length];
		int i, a = 0, b = 0;
		for (i = 0; i < mas.length + mas2.length; ++i) {
			if (a == mas.length) {
				mas3[i] = mas2[b];
				++b;
			} else if (b == mas2.length) {
				mas3[i] = mas[a];
				++a;
			} else if (mas[a] > mas2[b]) {
				mas3[i] = mas2[b];
				++b;
			} else {
				mas3[i] = mas[a];
				++a;
			}
		}
		return mas3;
	}
}
    	  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

