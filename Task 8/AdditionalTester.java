package core;

public class AdditionalTester {
	//�������� �����������,������������ ����������� private, ����� ���� ���������� ������������� �������� ����������� ����� ������.
	private AdditionalTester() {}
	//C���������� ������
    static int salary;
	static int expirienceInYears;
	public static int getSalary() {
		return salary;
	}
	public static void setSalary(int salary) {
		AdditionalTester.salary = salary;
	}
	public static int getExpirienceInYears() {
		return expirienceInYears;
	}
	public static void setExpirienceInYears(int expirienceInYears) {
		AdditionalTester.expirienceInYears = expirienceInYears;
	}
	public static int supplementnSalary() {
		int supplementn = 2;
		return (salary * supplementn);
	}
	public static int expirienceInMonth () {
		int months = 12;	
		return expirienceInYears * months;
	}	
	
	
	
	
	
	
	
	
	
	
}
