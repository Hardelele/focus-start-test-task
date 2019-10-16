package main;

public class MainExecutor {

    private static String[] args;

    /**
     * Method run() only execute methods, that implemented in MainExecutor.java
     */

    public static void run() {
        setIOFiles();
    }

    /**
     * Public method getArgs have to be used for
     * getting args[] from FocusStartApplication.main()
     *
     * @param args it's names of IO files.
     */

    public static void getArgs(String[] args) {
        MainExecutor.args = args;
    }

    /**
     * Method setIOFiles have to execute 2 methods:
     * FileReader.setInputFile(args[0]);
     * FileWriter.setOutputFile(args[1]);
     * It's used in method run(), to make that one more readable.
     */

    private static void setIOFiles() {
        FileReader.setInputFile(args[0]);
        FileWriter.setOutputFile(args[1]);
    }

}
