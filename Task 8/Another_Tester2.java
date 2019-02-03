package start;

import core.Tester;

public class Another_Tester2 {

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
		// Невозможно вызвать метод, т.к. метод с модификатором *friendly и он доступен
		// только в пакете core
		System.out.println(tester.expirienceInMonth());
		// Невозможно вызвать метод, т.к. метод с модификатором *protected и он доступен
		// только в пакете core
		tester.informationaboutTester();
		// метод с модификаторм *public доступен отовсюду
		tester.allInformationaboutTester();
		// Невозможно вызвать метод, т.к. метод с модификатором *private
		// и он доступен только внутри класса Tester
		tester.supplementnSalary();
	}

}
