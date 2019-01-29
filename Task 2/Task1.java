package core;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
		mas[i] = (int) (Math.random() * 10);
	
       System.out.print(mas[i] + " "); 
		}
       System.out.println(" ");
       
        for (int i = size_mas - 1; i >= 0; i--) {
        	System.out.print(mas[i] + " ");
        }
       scan.close ();
        }
	}

