package core;

public class Tasks {

	public static void main(String[] args) {
		//Создание объекта класса Tester
		Tester tester = new Tester("Olia", "Ivanova", 4, "Intermediate", 700.00);
		System.out.println(tester.getName() + " " + tester.getSurname() + " " + tester.getExpirienceInYears() + " "
				+ tester.getEnglishLevel() + " " + tester.getSalary());
		//Вызов перегруженных 3 конструкторов
		Tester tester1 = new Tester("Peter", "Petrov", 5);
		Tester tester2 = new Tester("Vasia", "Pupkin", 6, "Pre-Intermediate");
		Tester tester3 = new Tester("Marya", "Kozlova", 7, "Advanced", 800.00);
		System.out.println(tester1.getName() + " " + tester1.getSurname() + " " + tester1.getExpirienceInYears() + " "
				+ tester1.getEnglishLevel() + " " + tester1.getSalary());
		System.out.println(tester2.getName() + " " + tester2.getSurname() + " " + tester2.getExpirienceInYears() + " "
				+ tester2.getEnglishLevel() + " " + tester2.getSalary());
		System.out.println(tester3.getName() + " " + tester3.getSurname() + " " + tester3.getExpirienceInYears() + " "
				+ tester3.getEnglishLevel() + " " + tester3.getSalary());
		//Вызов созданных в классе Tester перегруженных методов
		tester.informationaboutTester("Olia");
		tester.informationaboutTester("Olia", "Ivanova");
		tester.informationaboutTester("Olia", "Ivanova", "Advanced");
		//Вызов статического метода
		System.out.println(Tester.getCleanSalary(700));

	}
}




