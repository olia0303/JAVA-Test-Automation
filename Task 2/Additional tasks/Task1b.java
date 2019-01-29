package core;

import java.util.Scanner;

public class Task1b {

	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество строк массива: ");
		a = scan.nextInt();
		System.out.print("Введите количество столбцов массива: ");
		b = scan.nextInt();
		int [] [] mas = new int [a] [b];
		for (int i = 0; i < mas.length; i++) { 
			for (int j = 0; j < mas[i].length; j++){	
			mas[i][j] = (int)(Math.random()*50);
			
		  System.out.print(mas[i][j] + " "); 
	         }
          System.out.println(" ");
		}
		scan.close();
	      int min = mas [0] [0]; 
          int max = mas [0] [0];
         for (int i = 0; i < mas.length; i++) {
         for (int j = 0; j < mas[i].length; j++) {
              	if (min > mas[i][j])
              		min = mas [i][j];
         
                 if (max < mas[i][j])
                     max = mas [i][j];
         }
         }   
     System.out.print("\n Минимальный элемент = " + min );      
     System.out.print("\n Максимальный элемент = " + max );
   }
}