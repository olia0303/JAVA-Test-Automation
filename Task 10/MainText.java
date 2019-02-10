package core;
import core.Text_text;
import java.util.Scanner;

public class MainText {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text before change: ");
		String line = "";
		String text = "";
		while (true) {
			line = scan.nextLine();
			if ("/".equals(line)) {
				break;
			}
			text = line + text;
		}
		System.out.println("Enter number of symbol: ");
		int symbol = scan.nextInt();
		while (symbol < 1) {
			System.out.println("Incorrect! Enter number of symbol again: ");
			symbol = scan.nextInt();
		}
		System.out.println("Changes in the text: ");

		Text_text.chandedTextWithSymbols(text, symbol);
		scan.close();

	}

}
