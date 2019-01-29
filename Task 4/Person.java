package core;

public class Person {
//������� ����� Person �� ���������� ������: name,surname,age,phone
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

	// ���������������� ��� ��� ������ ������� set-.
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

	// ���������������� ��� ��� ������ ������� get
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
	
	 /* ����� printAllInformation(), ������� ������� �� ����� ��� ���������� �
	 * ������������ (name + surname + age + phone) � ���� ������;
	 */
	public void printAllinformtion() {
		System.out.println(getName() + " " + getSurname() + " " + getAge() + " " + getPhone());
	}

//����� printName(), ������� ������� ������ ��� � ������� (name + surname) ������������;
	public void printName() {
		System.out.println(getName() + " " + getSurname());
	}

//����� isAdult(), ������� ���������� �������� true/false � ����������� �� age ������� (> 18)
	public boolean isAdult() {
		if (this.age > 18) {
			return true;
		} else {
			return false;
		}
	}
}
