package files;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class WriteFile {
    public WriteFile(String path) throws EOFException, FileNotFoundException {
        try{
            Formatter file = new Formatter(path);
            file.format("%s  is %s %s","Full name","Ayomide","Stephen\r\n");
            file.format("%s is %d", "age",12);
            file.close();
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException("File Not found");
        }
    }
}
