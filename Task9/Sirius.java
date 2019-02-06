package core;

import java.util.Objects;

public class Sirius extends Star {
	private String type;
	private int age;

	public Sirius() {
		
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printTypeOfSirius() {
		System.out.println(type);
	}

	public void printAgeOfSirius() {
		System.out.println(age);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(type);

	}

	@Override
	public String toString() {
		return "Sirius: {TypeOfSirius: " + type + ",     AgeOfSirius: " + age + "}";
	}

	
	
	
	
}
