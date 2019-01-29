package core;
public class Tester {  
/*	������� ����� Tester �� ���������� ������: -name; -surname ;
 * -expirienceInYears;-englishLevel;-salary*/
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public double salary;
	//����������� � ���� ������ 3 ������������, ������ �� ������� ����� ��������������� �������� ������ ��������� this(...); 
	public Tester (String name, String surname,int expirienceInYears){
		this.name = name;
		this.surname = surname;
		this.expirienceInYears = expirienceInYears;
	}
	public Tester(String name, String surname, int expirienceInYears,String englishLevel) {
		this (name, surname, expirienceInYears);
		this.englishLevel = englishLevel;	
	}
	public Tester(String name, String surname, int expirienceInYears,String englishLevel,double salary ) {
	    this(name, surname, expirienceInYears, englishLevel);
	    this.salary = salary;
	}
	public String getName() {
	    return this.name;	
	}
	public String getSurname() {
	return this.surname;
     }
	public int getExpirienceInYears () {
	 return this.expirienceInYears;
    }		 		 
	public String getEnglishLevel() {
		return this.englishLevel;		
	}
	public double getSalary() {
		return this.salary;
	}
	//�������� 3 ����� ������������� ������ � ���� ������
	public  void informationaboutTester(String name) {
		System.out.println(name);
	}
	public  void informationaboutTester(String name, String surname) {
		System.out.println(name + " " + surname);
	}	
		
	public  void informationaboutTester(String name, String surname,String englishLevel) {
		System.out.println(name + " " + surname + " " + englishLevel);
	}
	//�������� ����������� ����� � �������� ������ ��� ����������� ������ � ������ ������
	public static double  getCleanSalary( double salary) {
	        return salary*0.8;
		
}
}
