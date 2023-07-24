import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class TextWriter {
    public static void writeUserDataToFile(String lastName, String firstName, String patronymic,
                                            Date dateOfBirth, long phoneNumber, char gender) throws IOException {
        String fileName = lastName + ".txt";
        String userData = "<" + lastName + ">" + "<" + firstName + ">" + "<" + patronymic + ">" + "<" + dateOfBirth + ">" + "<" + phoneNumber + ">" + "<" + gender + ">";

        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(fileName, true))) {
            writer.write(userData);
            writer.newLine();
        }
    }
}

