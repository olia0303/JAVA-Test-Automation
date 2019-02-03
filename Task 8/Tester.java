package core;
/*	Создать класс Tester со следующими полями: -name; -surname ;
 * -expirienceInYears;-englishLevel;-salary*/
public class Tester {
	public String name;
	String surname;
	private int expirienceInYears;
	protected String englishLevel;
	public int salary;
/*Перегрузить в этом классе 3 конструктора, каждый из которых будет
 * последовательно вызывать другой используя this(...); 
 * Конструктор с наибольшим числом параметров сделать с уровнем доступа отовсюду*/
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
//Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета.	
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
//Написать метод с уровнем доступа только внутри класса, который будет возвращать salary*2;
	private int supplementnSalary() {
		int supplementn = 2;
		return (salary * supplementn);
	}
	
//Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;
	int expirienceInMonth () {
		int months = 12;	
		return expirienceInYears * months;
	}	
//Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;
	protected  void informationaboutTester() {
		System.out.println(name + " " + surname);
	}
//Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.
	public  void allInformationaboutTester() {
		System.out.println(name + " " + surname + " " + expirienceInYears + englishLevel + salary  );
	}
	
	
}
