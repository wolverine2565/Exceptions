import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.








//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

class FloatChecker {

        private static PrintStream out = new PrintStream(System.out);
        private static PrintStream err = new PrintStream(System.err);

        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            float number = readFloatFromUser();
            out.println("Введенное число: " + number);
        }

        private static float readFloatFromUser() {
            Scanner scanner = new Scanner(System.in);
            float number = 0;

            while (true) {
                out.println("Введите дробное число: ");
                try {
                    number = scanner.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    err.println("Ошибка: введено неверное значение. Повторите ввод.");
                    scanner.nextLine();
                }
            }

            return number;
        }
    }
