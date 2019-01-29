package core;

import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print("Введите размер массива: ");
	Scanner scan = new Scanner(System.in);
	int size_mas = scan.nextInt();
	int [] mas = new int [size_mas];
	for (int i = 0; i < size_mas; i++) {
		mas[i] = (int) (Math.random() * 25);
            System.out.print(mas[i] + " "); 
	      }
            System.out.print(" ");
      
            for (int i = 0; i <size_mas; i++) {
	            
//            	int temp = mas [0];                  Меняем 1 эл и последний
//	            mas [0] = mas [size_mas - 1];
//	             mas [size_mas - 1] = temp;
            	int temp = mas [1];                   // второй и предпоследний
            	mas [1] = mas [size_mas - 2] ;
            	mas [size_mas - 2]  = temp;
            }
           System.out.println("\nChange");
           for (int x : mas)
             System.out.print(x + " ");
           scan.close ();
}
}