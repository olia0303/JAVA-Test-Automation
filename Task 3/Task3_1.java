package core;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		System.out.print("¬ведите 2 числа: " + " ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
        int result = minFunction(a, b);
        System.out.print("Min number: " + result);
        scan.close();
	}
     public static  int minFunction(int n, int n1) {
		
    	int min;
    	if (n1 < n ){
    		min = n1 ;
    	}else {
    		min = n;
    	}
    	 return min;
    	
     }
    
	}

 
