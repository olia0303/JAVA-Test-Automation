package core;

import java.util.Scanner;

public class Starter {
	 public static String[] enterStrings() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Введите количество строк: ");
	        int countStrings = scan.nextInt();
	        scan.nextLine();
	        String[] masStr = new String[countStrings];
	        for (int i = 0; i < countStrings; i++) {
	            System.out.println("Строка № " + i);
	            masStr[i] = scan.nextLine();
	        }
	        scan.close();
	        return masStr;
	    }

	    public static void printStringArray(String[] strings) {
	        for (String print : strings) {
	            System.out.println(print);
	        }
	    }

	}

