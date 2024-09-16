import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Generic class
public class GenericFileReader<T> {
    private File file;

    public GenericFileReader(String fileName) {
        this.file = new File(fileName);
    }

    public T read() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext()) {
            return (T) scanner.nextLine();
        } else {
            throw new FileNotFoundException("File is empty");
        }
    }
}
