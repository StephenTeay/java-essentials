package files;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public ReadFile(String path) throws IOException {

        try{
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }
        catch(IOException e){
            throw new IOException("File doesn't exist",e);
        }
    }
}
