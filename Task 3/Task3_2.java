package core;

public class Task3_2 {

	public static void main(String[] args) {
		   int a = 100;
		   int b = 200;
		   int result = a + (int) (Math.random() * (b-a));
		   System.out.println("���������� �����: "  + result);		  
		   boolean number =  checkNumber(result);
		   System.out.println ("\n��� �������� ������?: " + (number));
		 
		 } 
		 
	   public static boolean checkNumber(int num) {
		   if (num % 2 == 0) {
			  return true;
		   }else {
			   return false;
		   }
			    
	  }

}