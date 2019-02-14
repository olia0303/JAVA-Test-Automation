package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {
	ArrayList<Button> buttons = new ArrayList<Button>();
	LinkedList<Field> fields = new LinkedList<Field>();
	HashSet<Label> labels = new HashSet<Label>();
	HashMap<String, Dropdown> dropdowns = new HashMap<String, Dropdown>();
	private float id;
	private String title;

	public Page(String title, float id) {
		this.title = title;
		this.id = id;

	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//First collection	
	public void addToArrayList(Button button) {
		buttons.add(button);
	}

	public void removeToArrayList(Button button) {
		buttons.remove(button);
	}

	public void ChangedElementsToArrayList(int index, Button button) {
		buttons.set(index, button);
	}

	public void printAlltoArrayList() {
		buttons.stream().forEach(System.out::println);
	}
	// Second collection

	public void addToLinkedList(Field field) {
		fields.add(field);
	}

	public void removeToLinkedList(Field field) {
		fields.remove(field);
	}

	public void ChangedElementsToLinkedList(int index, Field field) {
		fields.set(index, field);
	}

	public void printAlltoLinkedList() {
		fields.stream().forEach(System.out::println);
	}

	// Third collection
	public void addToHashSet(Label newlabel) {
		labels.add(newlabel);
	}

	public void removeToHashSet(Label newlabel) {
		labels.remove(newlabel);
	}

	public void ChangedElementsToHashSet(Label label, Label newlabel) {
		if (labels.contains(label)) {
			labels.remove(label);
			labels.add(newlabel);
		}

	}

	public void printAlltoHashSet() {
		labels.stream().forEach(System.out::println);
	}

	// Fourth collections
	public void addToHashMap(Dropdown dropdown) {
		dropdowns.put(dropdown.name, dropdown);
	}

	public void removeToHashMap(Dropdown dropdown) {
		dropdowns.remove(dropdown.name, dropdown);
	}

	public void ChangedElementsToHashMap(Dropdown dropdown, Dropdown newdropdown) {
		dropdowns.replace(dropdown.name, newdropdown);
	}

	public void printAlltoHashMap() {
		dropdowns.keySet().stream().forEach(key -> System.out.println(dropdowns.get(key)));
	}

	@Override
	public String toString() {
		return this.id + " " + this.title;
	}

}
