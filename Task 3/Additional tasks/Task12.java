package start;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
//���������� �������� ��� �������� ������ �� 2 ������� (1-� ������� ������ 3-�, 2-� ����� 4-� � �.�.)		
			System.out.print("������� ������ �������: ");
			Scanner scan = new Scanner(System.in);
			int size_mas = scan.nextInt();
			int [] mas = new int [size_mas];
			for (int i = 0; i < size_mas; i++) {
				mas[i] = (int) (Math.random() * 100);
				scan.close ();
	       System.out.print(mas[i] + " "); 
			}
	      //System.out.print(" ");
	      System.out.println("\nChange");
	      int[] result;
		  result = multiplyMassive(mas);
	      for (int x : result)
       	    System.out.print(x + " ");
	      }    
	      
	      public static int[] multiplyMassive(int[] anyMas) {
	      int [] resulMas = new int [anyMas.length];
	      for (int i = 0;i < anyMas.length - 2; i++) {
	    	  resulMas[i+2] = anyMas[i];
	      }
          return resulMas;
	      }

}
