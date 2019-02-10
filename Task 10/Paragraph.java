package core;

import static core.TextElements.divider;
import static core.TextElements.space;

public class Paragraph extends Text {

	public Paragraph(String paragraph) {
		super(paragraph);
	}

	@Override
	public String[] shareTextletters() {
		return getLetter().split(divider);
	}

	@Override
	public void appendLetters(String[] letters) {
		StringBuilder strbul = new StringBuilder();

		for (int i = 0; i < letters.length; i++) {
			strbul.append(letters[i]);
			if (i != letters.length - 1) {
				strbul.append(space);
			}

		}
		setLetter(strbul.toString());
	}
	

}
