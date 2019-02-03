package core;
/*Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
 * Если таких слов несколько, найти первое из них.*/
public class Task7 {

	public static void main(String[] args) {

        String[] masStr = Starter.enterStrings();

        for (String str : masStr) {
            if (str.length() == str.chars().distinct().count()) {
                System.out.println("Слово с различными символами: " + str);
                break;
            } else
                System.out.println("Слово не найдено!");
        }

    }
}

