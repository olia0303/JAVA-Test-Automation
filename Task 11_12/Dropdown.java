package core;

import java.util.Arrays;
import java.util.List;

public class Dropdown {

	List<String> options;
	boolean isSelected;
	String name;

	public Dropdown(String name, boolean isSelected, String... options) {
		this.name = name;
		this.isSelected = isSelected;
		this.options = Arrays.asList(options);
	}

	@Override
	public String toString() {
		return this.name + " " + this.isSelected + " " + this.options;
	}

}