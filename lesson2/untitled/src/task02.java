import java.io.PrintStream;
import java.util.Scanner;

//Задание 2
public class task02 {
    private static PrintStream out = new PrintStream(System.out);
    private static PrintStream err = new PrintStream(System.err);

    static Scanner scanner = new Scanner(System.in);
    private static double intArray;

    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = intArray / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }




    }
}
