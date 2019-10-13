package main;

public class FocusStartApplication {

    public static String inputFileName, outputFileName;

    /**
     * cornetString основная переменная для обработки строк получаемых их файла.
     * Разбивается на лексемы, сохраняется в классе IsoscelesTriangle, соответствующего индекса.
     */

    public static String cornetString;

    public static void main(String[] args) {
        inputFileName = args[0];
        outputFileName = args[1];
    }
}
