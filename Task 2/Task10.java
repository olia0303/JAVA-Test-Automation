package core;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("¬ведите размер массива: ");
		Scanner scan = new Scanner(System.in);
		int size_mas = scan.nextInt();
		int [] mas = new int [size_mas];
		for (int i = 0; i < size_mas; i++) {
			mas[i] = (int) (Math.random() * 50)+10;
	
       System.out.println(mas[i]); 
		}
       System.out.print(" ");
    boolean flag = true;
    for (int i = 1; i < size_mas; i++) {
         if(mas[i] <= mas[i-1]){
            flag = false;
            break;
        }
    }
    if(flag){
        System.out.println("ћассив €вл€етс€ строго возрастающей последовательностью");
    } else {
        System.out.println("ћассив не €вл€етс€ строго возрастающей последовательностью");
    }
    scan.close ();
}
}
