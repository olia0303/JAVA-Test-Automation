package core;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите количество строк массива: ");
		a = scan.nextInt();
		System.out.print("¬ведите количество столбцов массива: ");
		b = scan.nextInt();
		int [] [] mas = new int [a] [b];
		for (int i = 0; i < mas.length; i++) { 
			for (int j = 0; j < mas[i].length; j++){	
			mas[i][j] = (int)(Math.random()*10);
			
		System.out.print(mas[i][j] + " "); 
	}
          System.out.println(" ");
		}
		System.out.println();
		for (int i = mas.length-1;i >= 0;i--){
		for (int j = mas[i].length-1;j >= 0;j--){
		System.out.print(mas[i][j] + " ");
		}
		 System.out.println(" ");
		
		
		}
 
		scan.close();
		
	}
     
	}


