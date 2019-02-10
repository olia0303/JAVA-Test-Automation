package core;

public class Text_text {

	public static void chandedTextWithSymbols(String text, int symbol) {
		Text paragraph = new Paragraph(text);
		String[] sentLetters = paragraph.shareTextletters();
		String[] changedSentLetters = new String[sentLetters.length];

		for (int j = 0; j < sentLetters.length; j++) {
			Text sentence = new Sentence(sentLetters[j]);

			String[] wordLetters = sentence.shareTextletters();
			String[] changedWordLetters = new String[wordLetters.length];

			for (int i = 0; i < wordLetters.length; i++) {
				Text word = new Word(wordLetters[i]);
				((Word) word).replaceSymbol(symbol);
				changedWordLetters[i] = word.getLetter();
				System.out.println("Word: " + changedWordLetters[i]);
			}

			sentence.appendLetters(changedWordLetters);
			changedSentLetters[j] = sentence.getLetter();
			System.out.println("Sentence: " + changedSentLetters[j]);

		}

		paragraph.appendLetters(changedSentLetters);
		System.out.println("Paragraph: " + paragraph.getLetter());

	}
}
