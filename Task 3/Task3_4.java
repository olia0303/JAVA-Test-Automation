package core;

public class Task3_4 {

	public static void main(String[] args) {
		   int a = 5;
		   int b = 15;
		   int number = a + (int) (Math.random() * (b-a));
		   System.out.println("Полученное число: "  + number);	
	       int result1 = cube (number);
	       System.out.println("Число в кубе: "  + result1);
	     
	  
		}
	        public static int cube (int f) {
	        int result = f * f * f;
		    return result;
		}
	}
