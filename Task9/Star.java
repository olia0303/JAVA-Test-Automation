package core;

import java.util.Objects;

public class Star extends StarSystem {

	private String compOfStar;
	private int temp;
	
	public Star () {
		
	}
	public String getCompOfStar() {
		return compOfStar;
	}

	public void setCompOfStar(String compOfStar) {
		this.compOfStar = compOfStar;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void printComponentOfStar() {
		System.out.println(compOfStar);
	}

	public void printTemperatureOfStar() {
		System.out.println(temp);
	}

	@Override
	public void printInformationOfSystem() {
		System.out.println("Information about Star: " + super.getNum() + super.getType());

	}

	@Override
	public void printTypeOfSystem() {
		System.out.println("Type of System:" + super.getNum() + super.getType());

	}

	@Override
	public int hashCode() {
		return Objects.hashCode(temp);
	}

	@Override
	public String toString() {
		return "Planet: {componentOfStar: " + compOfStar + " ,    temperature=" + temp + "}";

	}

}
