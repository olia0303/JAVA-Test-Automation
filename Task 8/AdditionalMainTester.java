package core;

public class AdditionalMainTester {
	public static void main(String[] args) {
		int salary = 150; 
		int expirienceInYears = 5;
		//���������� ������� ������ ������ AdditionalTester, � ����� � ���, ��� �� ������� �������� �����������
		//��� ���������� ��������� ������, �.�. ���������� ����������
		//AdditionalTester tester = new AdditionalTester();
		//��������� ����������� ������  ������ AdditionalTester, ����� ������ �����������, ���������� �������������
		// � ��������� �� ��� �������� ������� ������
		AdditionalTester.setSalary(salary);
		AdditionalTester.setExpirienceInYears(expirienceInYears);
		AdditionalTester.supplementnSalary();
		AdditionalTester.expirienceInMonth(); 
	}
}