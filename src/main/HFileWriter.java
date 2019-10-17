package main;

import java.io.*;

public class HFileWriter {

    private static FileWriter fileWriter = null;

    private static BufferedWriter bufferedWriter = null;

    private static File outputFile = null;

    public static void setOutputFile(String ref) {
        HFileWriter.outputFile = new File(ref);
    }

    /**
     * Method checkOutputFile() check existence of
     * output File and if it isn't, create that one.
     */

    public static void checkOutputFile() {

        if(!outputFile.exists()) {

            try {
                outputFile.createNewFile();
            } catch (IOException e) {
                ExceptionsPrinter.printIOException();
            }

        }

    }

    /**
     * Method write() save writableString as result in outputFile
     */

    public static void write(String writableString) {

        try {
            fileWriter = new FileWriter(outputFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(writableString);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
        }

    }

}
