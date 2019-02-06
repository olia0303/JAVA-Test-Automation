package core;
import java.util.Objects;

public class Planet extends StarSystem {

	private String classOfPlanet;
	private String compOfPlanet;
	private int diametr;

	public Planet() {

	}

	public Planet(String classOfPlanet) {
		super ();
		this.classOfPlanet = classOfPlanet;
	}

	public Planet(String classOfPlanet, String compOfPlanet, int diametr) {
		super ();
		this.classOfPlanet = classOfPlanet;
		this.compOfPlanet = compOfPlanet;
		this.diametr = diametr;
	}

	public void printClassOfPlanet() {
		System.out.println(classOfPlanet);
	}

	public void printComponentOfPlanet() {
		System.out.println(compOfPlanet);

	}

	@Override
	public void printInformationOfSystem() {
		System.out.println("Information about Planet: " + super.getNum() + super.getType());

	}

	@Override
	public void printTypeOfSystem() {
		System.out.println("Type of System:" + super.getNum() + super.getType());

	}

	@Override
	public int hashCode() {
		return Objects.hashCode(diametr);
	}

	@Override
	public String toString() {
		return "Planet: {classOfPlanet: " + classOfPlanet + " ,    compOfPlanet=" + compOfPlanet + " ,   " + "diametr="
				+ diametr + "}";

	}

}
