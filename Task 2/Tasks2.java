package core;

import java.util.Scanner;

public class Tasks2 {

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() *20)+10;
	
       System.out.println(mas[i]); 
		}
       System.out.print(" ");
       
   	int product = 1;
   	int i = 0;
   	while (i < size_mas) {
   		product = product * mas [i];
   		i++;
   	}	
	System.out.print("Произведение элементов = " + product);	
	
	scan.close ();
	}
	
}


