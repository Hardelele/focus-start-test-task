package main;

import java.io.File;

public class FileReader {

    private static File inputFile;

    public static void setInputFile(String ref) {
        FileReader.inputFile = new File(ref);
    }
}
