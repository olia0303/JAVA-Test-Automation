package core;

import java.util.ArrayList;

public class Task2d {

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
     System.out.println(" Size before removing elements : "  + list.size());
     
     
     list.clear();
     System.out.println(" Size after removing elements : "  + list.size());
	}
}
