package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Massive {
	int[] anyMas;
	int size = enterSize();
	int temp;
	int number;

	public Massive() {
		this.anyMas = new int[size];
	}

	public int enterSize() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter size: ");
			size = sc.nextInt();
			return size;
		} catch (InputMismatchException e) {
			System.out.println("Invalid number input ");
		} finally {
			sc.close();
		}
		return enterSize();
	}

	public int[] recordMas() {

		for (int i = 0; i < size; i++) {
			anyMas[i] = (int) Math.round(Math.random() * 50);
		}
		System.out.println("This array is:");
		for (int x : anyMas) {
			System.out.print(x + " ");
		}
		return anyMas;
	}

	public int findElementByIndex(int index) {
		try {
			return anyMas[index];
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("\nElement is not found.");
			return anyMas.length;
		}
	}

	public void swapElementsInMas(int index) {

		try {
			temp = anyMas[index];
			anyMas[index] = anyMas[index + 1];
			anyMas[index + 1] = temp;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nNothing to change.");
		}

	}

	public void checkedElementsMas() {

		try {
			number = 0;
			anyMas[size] = number;
			anyMas[3] = anyMas[1] / number;

		} catch (ArithmeticException e) {
			System.out.println("\nDivide by zero");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nOut of bounds array");
		}

	}

}
