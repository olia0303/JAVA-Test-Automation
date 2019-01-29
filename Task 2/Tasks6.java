package core;

import java.util.Scanner;

public class Tasks6 {
	public static void main(String[] args) {
	System.out.print("¬ведите размер массива: ");
	Scanner scan = new Scanner(System.in);
	int size_mas = scan.nextInt();
	int [] mas = new int [size_mas];
	for (int i = 0; i < size_mas; i++) {
		mas[i] = (int) (Math.random() * 10);

   System.out.print(mas[i] + " "); 
	}
   System.out.println(" ");
   int i = 0;
   while (i <size_mas-1) {
		
		int temp = mas [i];
		mas [i] = mas [i+1];
		mas [i+1] = temp;
		i+=2;
	}

	System.out.println("Change");
	for (int x : mas)
	    System.out.print(x + " ");
	scan.close ();
	}
	}
