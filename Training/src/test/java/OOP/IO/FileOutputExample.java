package OOP.IO;
import java.io.FileWriter;
import java.io.IOException;

    public class FileOutputExample {

        public static void main(String[] args) throws IOException {
            String fileName = "output.txt";
            String content = "This is some text to write to the file.";

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(content);
            }
        }
    }