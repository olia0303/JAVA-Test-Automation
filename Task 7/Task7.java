package core;
/*������ n ���� � �������. ����� �����, ��������� ������ �� ��������� ��������. 
 * ���� ����� ���� ���������, ����� ������ �� ���.*/
public class Task7 {

	public static void main(String[] args) {

        String[] masStr = Starter.enterStrings();

        for (String str : masStr) {
            if (str.length() == str.chars().distinct().count()) {
                System.out.println("����� � ���������� ���������: " + str);
                break;
            } else
                System.out.println("����� �� �������!");
        }

    }
}

