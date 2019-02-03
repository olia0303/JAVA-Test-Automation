package core;

public class AdditionalMainTester {
	public static void main(String[] args) {
		int salary = 150; 
		int expirienceInYears = 5;
		//Невозможно создать объект класса AdditionalTester, в связи с тем, что мы создали закрытый конструктор
		//При компиляции возникает ошибка, т.к. контруктор недоступен
		//AdditionalTester tester = new AdditionalTester();
		//Использую статические методы  класса AdditionalTester, можно обойти ограничение, наложенное конструктором
		// и запустить их без создания объекта класса
		AdditionalTester.setSalary(salary);
		AdditionalTester.setExpirienceInYears(expirienceInYears);
		AdditionalTester.supplementnSalary();
		AdditionalTester.expirienceInMonth(); 
	}
}