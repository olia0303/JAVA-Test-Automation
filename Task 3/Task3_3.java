package core;

public class Task3_3 {

	public static void main(String[] args) {
	   int a = 1;
	   int b = 10;
	   int number = a + (int) (Math.random() * (b-a));
	   System.out.println("���������� �����: "  + number);	
       int result1 = square (number);
       System.out.println("����� � ��������: "  + result1);
     
  
	}
        public static int square (int f) {
        int result = f * f;
	    return result;
	}
}
