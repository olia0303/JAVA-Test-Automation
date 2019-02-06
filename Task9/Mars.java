package core;

import java.util.Objects;

public class Mars extends Planet {
	private int num;
	private String sputnik;

	public void printNumbersOfMars() {
		System.out.println(num);
	}

	public void printSputnikOfMars() {
		System.out.println(sputnik);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSputnik() {
		return sputnik;
	}

	public void setSputnik(String sputnik) {
		this.sputnik = sputnik;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(num);
	}

	@Override
	public String toString() {
		return "Mars: {NumbersOfMars: " + num + ",     sputnik=" + sputnik + "}";
	}

}

