package core;

public class AnotherPerson {

	public static void main(String[] args) {
		//Создать объект класса Person: Person person;
		Person person = new Person ();
		//вызов метода из класса Person printAllInformation;
	    person.printAllinformtion();
	    //вызов метода из класса Person printName;
	    person.printName();
	  //вызов метода из класса Person isAdult
	    System.out.println(person.isAdult());
	}

}
