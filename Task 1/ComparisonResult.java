package core;

public class ComparisonResult {
public static void main(String[] args) {
	int a = 5;
	long c = 658;
	double d = 123.52;
	float e = 3.52f;
	if ( c > d ) {
		System.out.println("True");
	}else { 
		System.out.println("False");
	}
	
     if ( e < a) {
    	 System.out.println("True"); 
     }else {
    	 System.out.println("False");
     }

       if (a==c) {
    		System.out.println("Correctly");
    		}else { 
    			System.out.println("incorrectly");
    		}
    		
       if (d!=c) {
    	   System.out.println("Correctly");
		}else { 
			System.out.println("incorrectly");
       }
       
    }
}

