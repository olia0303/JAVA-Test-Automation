package core;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 20)+10;
	
       System.out.println(mas[i] + " "); 
		}
       System.out.print(" "); 
       scan.close ();
	     int min = mas [0]; // �������� ����������� ������� ��� 1 �� �������
	     int max = mas [0];
        for (int i = 0; i < size_mas; i++) {
        	if (min > mas[i])
        		min = mas [i];
        }
        for (int i = 0; i < size_mas; i++) {
        	if (max < mas[i])
        		max = mas [i];
        }
        
        System.out.print("\n ����������� ������� = " + min );      
        System.out.print("\n ������������ ������� = " + max );
}
	
}