package core;
public class Tester {  
/*	—оздать класс Tester со следующими пол€ми: -name; -surname ;
 * -expirienceInYears;-englishLevel;-salary*/
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public double salary;
	//ѕерегрузить в этом классе 3 конструктора, каждый из которых будет последовательно вызывать другой использу€ this(...); 
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
	//Ќаписать 3 любых перегруженных метода в этом классе
	public  void informationaboutTester(String name) {
		System.out.println(name);
	}
	public  void informationaboutTester(String name, String surname) {
		System.out.println(name + " " + surname);
	}	
		
	public  void informationaboutTester(String name, String surname,String englishLevel) {
		System.out.println(name + " " + surname + " " + englishLevel);
	}
	//Ќаписать статический метод и показать пример его корректного вызова в другом классе
	public static double  getCleanSalary( double salary) {
	        return salary*0.8;
		
}
}
