package core;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		System.out.print("¬ведите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int size_mas = scanner.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 10);
	
         System.out.println(mas[i]); 
		 }
          System.out.println(" ");
       
	    for (int i = 1; i < size_mas; i++) {
		   if (i% 3 ==2)
			mas [i]=mas[i] * 2;
		}
	
		for (int x: mas)
			System.out.print(x + " ");	
		scanner.close ();
	}
	
}
  
    	  
    	  
     
