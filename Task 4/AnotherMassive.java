package core;

import java.util.Scanner;
public class AnotherMassive {
	public static void main(String[] args) {
		//������� ������ array � �������
		System.out.print("������� ������ �������: ");
		Scanner scan = new Scanner(System.in);
		int size_array = scan.nextInt();
		int[] array = new int[size_array];
		for (int i = 0; i < size_array; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		scan.close();
        //������� ������ ������ Massive
		Massive massive = new Massive();
		//��������� ������ ������ Massive ������� ��������� ���� array � ������ 
		massive.printMassiveAsline(array);
		//��������� ������ ������ Massive ������� ��������� ���� array � �������� �������
		massive.printReverseMasssiveAsline(array);
		//��������� ������ ������ Massive ������� ����� ��������� array
		System.out.println("Sum of elements:" + massive.getSumofElements(array));
		//��������� ������ ������ Massive �������� ��������� array �� 3
		array = massive.multiptyBy3(array);
		//��������� ������ ������ Massive ������� ���������� ����� ��������� array � ������ 
		massive.printMassiveAsline(array);
		//��������� ������ ������ Massive ������� ���������� ����� ��������� array � �������� �������
		massive.printReverseMasssiveAsline(array);
	}
}