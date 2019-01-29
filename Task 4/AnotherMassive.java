package core;

import java.util.Scanner;
public class AnotherMassive {
	public static void main(String[] args) {
		//—оздать массив array с данными
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_array = scan.nextInt();
		int[] array = new int[size_array];
		for (int i = 0; i < size_array; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		scan.close();
        //—оздать объект класса Massive
		Massive massive = new Massive();
		//»спользу€ методы класса Massive вывести созданный выше array в пр€мом 
		massive.printMassiveAsline(array);
		//»спользу€ методы класса Massive вывести созданный выше array в обратном пор€дке
		massive.printReverseMasssiveAsline(array);
		//»спользу€ методы класса Massive вывести сумму элементов array
		System.out.println("Sum of elements:" + massive.getSumofElements(array));
		//»спользу€ методы класса Massive умножить созданный array на 3
		array = massive.multiptyBy3(array);
		//»спользу€ методы класса Massive вывести полученный после умножени€ array в пр€мом 
		massive.printMassiveAsline(array);
		//»спользу€ методы класса Massive вывести полученный после умножени€ array в обратном пор€дке
		massive.printReverseMasssiveAsline(array);
	}
}