package core;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
			System.out.print("¬ведите размер массива: ");
			Scanner scan = new Scanner(System.in);
			int size_mas = scan.nextInt();
			int [] mas = new int [size_mas];
			int [] mas1 = new int [size_mas];
			for (int i = 0; i < size_mas; i++) {
				mas[i] = (int) (Math.random() * 100);
				scan.close ();
	       System.out.print(mas[i] + " "); 
			}
	      System.out.print(" ");
	      System.out.println("\nChange");
	      for (int i = 0;i < size_mas - 2; i++) {
	    	  mas1[i+2] = mas[i];
	      }
        
            for (int x : mas1)
         	    System.out.print(x + " ");
	      }
       
     }


