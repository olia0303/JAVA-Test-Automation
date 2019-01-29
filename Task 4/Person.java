package core;

public class Person {
//Создать класс Person со следующими полями: name,surname,age,phone
	public String name;
	public String surname;
	public int age;
	public int phone;

	public Person() {
		this.name = "Olia";
		this.surname = "Ivanova";
		this.age = 25;
		this.phone = 256478;
	}

	// инициализировать его при помощи методов set-.
	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	// инициализировать его при помощи методов get
	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}
	
	 /* метод printAllInformation(), который выводит на экран всю информацию о
	 * пользователе (name + surname + age + phone) в одну строку;
	 */
	public void printAllinformtion() {
		System.out.println(getName() + " " + getSurname() + " " + getAge() + " " + getPhone());
	}

//метод printName(), который выводит только имя и фамилию (name + surname) пользователя;
	public void printName() {
		System.out.println(getName() + " " + getSurname());
	}

//метод isAdult(), который возвращает значения true/false в зависимости от age объекта (> 18)
	public boolean isAdult() {
		if (this.age > 18) {
			return true;
		} else {
			return false;
		}
	}
}
