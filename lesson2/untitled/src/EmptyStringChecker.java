//        Разработайте программу, которая выбросит Exception,
//        когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение,
//        что пустые строки вводить нельзя.

import java.io.PrintStream;
import java.util.Scanner;

public class EmptyStringChecker {
    private static PrintStream out = new PrintStream(System.out);
    private static PrintStream err = new PrintStream(System.err);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            out.print("Введите какой-нибудь текст...");
            String UserInput = scanner.nextLine();

            if (UserInput.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }

            out.println("Введенная строка: " + UserInput);
        } catch (Exception e) {
            err.println("Ошибка: " + e.getMessage());
        }
    }
}

