package start;

import java.util.Scanner;

public class Task4 {
//����� ���������� ������� ���������, ������� ����������. ���� ������� ��������� ��� - ������� ���������, ��� �� ���
	public static void main(String[] args) {
		System.out.print("������� ������ �������: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int[] mas = new int[size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 5);
			System.out.println(mas[i]);
		}
		System.out.print(" ");
		printMasMultiply(mas);
		scan.close();
	}

	public static void printMasMultiply(int[] anyMas) {
		int count = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0)
				count++;
			}
		if (count != 0) {
			System.out.println("\n���������� ������� ���������:" + count + " ");
		} else {
			System.out.println("\n������� ��������� ���");
		}
		
	}
}
	