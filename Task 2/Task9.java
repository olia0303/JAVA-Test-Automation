package core;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		System.out.print("Введите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int size_mas = scanner.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 10);
	
       System.out.println(mas[i]); 
		}
       System.out.println(" ");
       scanner.close ();
        int min = mas [0];
        int max = mas [0];
		int index_min = 0;
		int index_max = 0;
		
		for (int i = 1 ; i < size_mas; i++) {
		if (min > mas [i])
		{
			    min = mas [i];
				index_min = i;
			}
	
			if (max < mas [i])
			{
				    max = mas [i];
					index_max = i;
				}
			}
        System.out.print("Номер минимального элемента = " + index_min);
        System.out.print("\nНомер максимального элемента = " + index_max);
        
		}
	}

	