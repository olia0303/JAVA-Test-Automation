package core;

public abstract class StarSystem {

	private String type;
	private int num;

	public StarSystem() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public abstract void printInformationOfSystem();

	public abstract void printTypeOfSystem();

	public abstract int hashCode();

	public abstract String toString();

	public void printTypeSystemOfStars() {
		System.out.println("Type of Stars: " + type);
	}

	public void printNumofStarsInSystem() {

		System.out.println("Number of Stars System: " + num);
	}

}