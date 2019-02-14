package core;

public class Main {

	public static void main(String[] args) {
		Page page = new Page("My book", 1478f);

		Button button = new Button("Enter", " Login");
		Button button1 = new Button("Enter", " Password");
		Button button2 = new Button("Enter", " Name");
		Button button3 = new Button("Enter", "Surname");

		page.addToArrayList(button);
		page.addToArrayList(button1);
		page.addToArrayList(button2);
		page.addToArrayList(button3);
		page.printAlltoArrayList();
		page.removeToArrayList(button);
		page.printAlltoArrayList();
		page.ChangedElementsToArrayList(0, button2);
		page.printAlltoArrayList();

		Field field = new Field(1, 5678);
		Field field1 = new Field(2, 5578);
		Field field2 = new Field(3, 5478);
		page.addToLinkedList(field);
		page.addToLinkedList(field1);
		page.addToLinkedList(field2);
		page.printAlltoLinkedList();
		page.removeToLinkedList(field);
		page.printAlltoLinkedList();
		page.ChangedElementsToLinkedList(0, new Field(1, 5678));
		page.printAlltoLinkedList();

		Label label1 = new Label("Yandex");
		Label label2 = new Label("Google");
		Label label3 = new Label("Gmail");
		page.addToHashSet(label1);
		page.addToHashSet(label2);
		page.addToHashSet(label3);
		page.printAlltoHashSet();
		page.removeToHashSet(label1);
		page.printAlltoHashSet();
		page.ChangedElementsToHashSet(label2, label3);
		page.printAlltoHashSet();

		Dropdown dpopdown1 = new Dropdown("Name1", true, "www1");
		Dropdown dpopdown2 = new Dropdown("Name2", true, "www2");
		Dropdown dpopdown3 = new Dropdown("Name3", true, "www3");
		page.addToHashMap(dpopdown1);
		page.addToHashMap(dpopdown2);
		page.addToHashMap(dpopdown3);
		page.printAlltoHashMap();
		page.removeToHashMap(dpopdown1);
		page.printAlltoHashMap();
		page.ChangedElementsToHashMap(dpopdown3, dpopdown2);
		page.printAlltoHashMap();

	}

}