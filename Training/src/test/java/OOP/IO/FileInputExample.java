package OOP.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) throws IOException {
        String fileName = "Data.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);

            }
        }
    }
}

