package files;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String path = "C:\\Users\\LENOVO\\Downloads\\a.txt";
        new CheckFileExist(path);
        new WriteFile(path);
        new ReadFile(path);
    }
}
