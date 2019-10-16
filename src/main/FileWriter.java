package main;

import java.io.File;

public class FileWriter {

    private static File outputFile;

    public static void setOutputFile(String ref) {
        FileWriter.outputFile = new File(ref);
    }

}
