package core;
/*	������� ����� Tester �� ���������� ������: -name; -surname ;
 * -expirienceInYears;-englishLevel;-salary*/
public class Tester {
	public String name;
	String surname;
	private int expirienceInYears;
	protected String englishLevel;
	public int salary;
/*����������� � ���� ������ 3 ������������, ������ �� ������� �����
 * ��������������� �������� ������ ��������� this(...); 
 * ����������� � ���������� ������ ���������� ������� � ������� ������� ��������*/
     Tester (String name, String surname,int expirienceInYears){
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
	}
	Tester(String name, String surname, int expirienceInYears,String englishLevel) {
		this (name, surname, expirienceInYears);
		this.englishLevel = englishLevel;	
	}
	public Tester(String name, String surname, int expirienceInYears,String englishLevel,int salary ) {
	    this(name, surname, expirienceInYears, englishLevel);
	    this.salary = salary;
	}
//�������� ��� ������� ���� get- � set- ������ � ������� ������� ������ ������ ������.	
	 void setName(String name) {
		this.name = name;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}
	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	String getSurname() {
		return surname;
	}
	int getExpirienceInYears() {
		return expirienceInYears;
	}
	String getEnglishLevel() {
		return englishLevel;
	}
	double getSalary() {
		return salary;
	}
//�������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� salary*2;
	private int supplementnSalary() {
		int supplementn = 2;
		return (salary * supplementn);
	}
	
//�������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� ���������� ����� � �������;
	int expirienceInMonth () {
		int months = 12;	
		return expirienceInYears * months;
	}	
//�������� ����� � ������� ������� ������ ������ � ��� ����������� � ������ �������, ������� ������� �� ����� ��� � �������;
	protected  void informationaboutTester() {
		System.out.println(name + " " + surname);
	}
//�������� ����� � ������� ������� ��������, ������� � ���� ������ ����� �������� ��� ���������� � ������������.
	public  void allInformationaboutTester() {
		System.out.println(name + " " + surname + " " + expirienceInYears + englishLevel + salary  );
	}
	
	
}
