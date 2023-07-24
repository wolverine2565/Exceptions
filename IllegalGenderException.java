public class IllegalGenderException extends IllegalArgumentException {

    public IllegalGenderException(String message) {
        super(message);
        System.err.println("Неверное значение пола");
    }
}

