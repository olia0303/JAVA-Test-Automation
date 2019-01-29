package core;

import java.util.ArrayList;

public class Task2b {
	public static void main(String[] args) {
		System.out.println("Original: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
    
     for (int i:list) {
            System.out.println(i);
            }   
    System.out.print("\nПоследовательное удаление элементов: ");
	while (list.size() > 0) {
		list.remove(list.size()-1);
	}
	if (list.size() == 0) {
		System.out.print(" Список очищен!");
	}
	else {
		System.out.print(" Список не очищен! ");
		
	}
	}
}