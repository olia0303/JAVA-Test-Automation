package core;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* ������ n ���� � �������. 
 * ����� ����, ��������� ������ �� ����, ����� �����-���������.
 * ���� ����� ���� ������ ������, ����� ������ �� ���.*/

public class Task8 {

	public static void main(String[] args) {
		 String[] masStr = Starter.enterStrings();
	        ArrayList<String> numbers = findOnlyNumber(masStr);
	        System.out.println("������ � �������: ");
	        numbers.forEach(System.out::println);

	        ArrayList<String> palindromes = findPalindromes(numbers);
	        System.out.println("������ �� �����-������������: ");
	        palindromes.forEach(System.out::println);

	        if (palindromes.size() > 1) {
	            System.out.println("������ �����-��������� : " + palindromes.get(1));
	        } else {
	            System.out.println("�����-���������: " + palindromes.get(0));
	        }
	    }

	    private static ArrayList<String> findOnlyNumber(String[] arrayStr) {
	        ArrayList<String> numbers = new ArrayList<String>();
	        Pattern p = Pattern.compile("\\d+");
	        Matcher m;
	        for (String str : arrayStr) {
	            m = p.matcher(str);
	            if (m.matches()) {
	                numbers.add(str);
	            }
	        }
	        return numbers;
	    }

	    private static ArrayList<String> findPalindromes(ArrayList<String> arrayStr) {
	        ArrayList<String> palindromes = new ArrayList<>();

	        for (String str : arrayStr) {
	            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
	                palindromes.add(str);
	            }
	        }
	        return palindromes;
	    }

	}