package start;

import java.util.Scanner;

public class Task2 {
// ����� ������������ ���� ��������� �������, �������
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 20);
			   System.out.println(mas[i]); 
			}
			System.out.println("������������: ");
	        int result = getMasProduct(mas);
			System.out.print(result);
		
	          scan.close ();
	}
       public static int getMasProduct(int [] anyMas)
       {
        int product = 1;
   	    for (int i = 0; i < anyMas.length; i++) {
   		     product = product * anyMas [i];	
         	}
   	           return product;
       }
}
	

