public class IllegalDateFormatException extends IllegalArgumentException {

    public IllegalDateFormatException(String message) {
        super(message);
        System.err.println("Неверное значение даты");
    }
}

