package core;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 50)+10;
	
       System.out.println(mas[i]); 
		}
       System.out.print(" ");	
		int count = 0;		
        for (int i = 0; i < size_mas; i++)		{
			if (mas[i] == 0) {
				System.out.println(i);
				count++;
			}			
		}
		if (count == 0)
	{
		System.out.println("Нулевых элементов нет");
	}	
		scan.close ();
		}
	}