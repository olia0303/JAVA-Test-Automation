package core;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(5);
         list.add(6);
         list.add(5);
         list.add(4);
         list.add(1);
         list.add(2);
         
      for (int i:list) {
    	 i = i + 2 ;
      System.out.println(i);
  }
	
	}
}


