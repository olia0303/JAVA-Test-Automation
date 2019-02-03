package core;

public class AnotherTester {

	public static void main(String[] args) {
		String name = "Ivan";
		String surname = "Petrov";
		int expirienceInYears = 5;
		String englishLevel = "A1";
		int salary = 150;
		// Инициализация
		Tester tester = new Tester(name, surname, expirienceInYears, englishLevel, salary);
		// метод get- c модификатором *friendly доступно только внутри пакета core
		System.out.println(tester.getName() + " " + tester.getSurname() + " " + tester.getExpirienceInYears() + " "
				+ tester.getEnglishLevel() + " " + tester.getSalary());
		// метод set- c модификатором *friendly доступно только внури пакета core
		tester.setName(name);
		tester.setSurname(surname);
		tester.setExpirienceInYears(expirienceInYears);
		tester.setEnglishLevel(englishLevel);
		tester.setSalary(salary);
		// метод с модификатором *friedly доступен только внутри пакета core
		System.out.println(tester.expirienceInMonth());
		// метод c модификаторм *protected доступен внутри пакета и для наследников в
		// других пакетаx
		tester.informationaboutTester();
		// метод с модификаторм *public доступен отовсюду
		tester.allInformationaboutTester();
		// Невозможно вызвать метод, т.к. метод с модификатором *private,т.к. он
		// доступен только внутри класса
		// tester.supplementnSalary();
	}

}
