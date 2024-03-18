import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SaveToFile {
    private static final String FILE_PATH = "C:/Users/Mark/Desktop/text.txt";
    private static final String RELATIVE_FILE_PATH = "./text.txt";
    public static void saveToFile() {
        System.out.println("Podaj przykładowy tekst:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Podany tekst to: " + text);

        writeTextToFile(text);
        readTextFromFile();
    }

    private static void readTextFromFile() {
        try {
            Path path = Paths.get(FILE_PATH);
            List<String> strings = Files.readAllLines(path);
            for (String fileText : strings) {
                System.out.println(fileText);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeTextToFile(String text) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Podałeś:");
            printWriter.println(text);
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
