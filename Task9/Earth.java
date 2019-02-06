package core;

import java.util.Objects;
public class Earth extends Planet {
	private String form;
	private int radius;
	private int weight;

	public Earth() {
	}
	public Earth(String classOfPlanet,String compOfPlanet, int diametr) {
	    super(classOfPlanet, compOfPlanet,diametr);
	}
	    public Earth(String classOfPlanet,String compOfPlanet, int diametr,String form) {
	    this(classOfPlanet, compOfPlanet, diametr);
		this.form = form;
	}

	public Earth(String classOfPlanet,String compOfPlanet, int diametr,String form, int radius, int weight) {
		this(classOfPlanet, compOfPlanet,diametr, form);
		this.radius = radius;
		this.weight = weight;
	}

	public void printFormOfEarth() {
		System.out.println(form);
	}

	public void printRadiusOfEarth() {
		System.out.println(radius);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(radius);
	}

	@Override
	public String toString() {
		return "Earth: {FormOfEarth: " + form + ",   radius=" + radius + ",     " + "weight=" + weight + "}";
	}

}
