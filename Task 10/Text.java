package core;

public abstract class Text {
	private String letter;

	public Text(String letter) {
		this.letter = letter;

	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public abstract String[] shareTextletters();

	public abstract void appendLetters(String[] letters);
}
