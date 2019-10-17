package main;

import java.io.File;

public class HFileWriter {

    private static File outputFile;

    public static void setOutputFile(String ref) {
        HFileWriter.outputFile = new File(ref);
    }

}
