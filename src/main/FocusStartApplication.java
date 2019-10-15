package main;

public class FocusStartApplication {

    public static String inputFileName, outputFileName;

    public static String cornetString;

    public static void main(String[] args) {
        setInputFileName(args[0]);
        setOutputFileName(args[1]);
        MainExecutor.run();
    }

    public static void setInputFileName(String inputFileName) {
        FocusStartApplication.inputFileName = inputFileName;
    }

    public static void setOutputFileName(String outputFileName) {
        FocusStartApplication.outputFileName = outputFileName;
    }

}
