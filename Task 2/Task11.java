package core;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 40)+10;
	
       System.out.print(mas[i] + " "); 
		}
       System.out.print(" ");
    
         for (int i = 1; i < size_mas - 1; i++) {
        	
		   mas [i] = (mas [i-1] + mas [i+1]) / 2;
		       
		    	System.out.println("\nmas["+i+"]=" + mas[i]+ " " 
		                                   + "равно полусумме элементов");  
		    }
         
     	for (int x : mas)
     	    System.out.print(x + " ");
     	
     	scan.close ();
     	}
     	}

       

