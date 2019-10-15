package main;

import java.io.File;

public class FocusStartApplication {

    public static File inputFile, outputFile;

    public static String cornetString;

    public static void main(String[] args) {
        setInputFileName(args[0]);
        setOutputFileName(args[1]);
        MainExecutor.run();
    }

    public static void setInputFileName(String inputFileName) {
        FocusStartApplication.inputFile = new File(inputFileName);
    }

    public static void setOutputFileName(String outputFileName) {
        FocusStartApplication.outputFile = new File(outputFileName);
    }

}
