package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckFileExist {

    public CheckFileExist(String path) throws IOException {
        File file = new File(path);
        if(file.exists()){
            String fileName = file.getName();
            System.out.println(fileName);
        }
        else {
            throw new IOException("File doesn't exist");
        }
    }
}
