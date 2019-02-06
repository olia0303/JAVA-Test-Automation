package core;

import java.util.Objects;

public class Sun extends Star {
	private String struct;
	private int radius;
    
	public Sun() {
		
	}
	public String getStruct() {
		return struct;
	}
	public void setStruct(String struct) {
		this.struct = struct;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void printStructureOfSun() {
		System.out.println(struct);
	}

	public void printRadiusOfSun() {
		System.out.println(radius);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(radius);
	}

	@Override
	public String toString() {
		return "Sun: {struct: " + struct + ",      radius: " + radius + "}";
	}
	
    
	
	
	
	
}
