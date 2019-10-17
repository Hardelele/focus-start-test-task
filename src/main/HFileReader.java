package main;

import java.io.*;

public class HFileReader {

    private static FileReader fileReader = null;

    private static BufferedReader bufferedReader = null;

    private static File inputFile = null;

    /**
     * Method setInputFile() used for set file in variable inputFile
     *
     * @param ref link to input file
     */

    public static void setInputFile(String ref) {
        HFileReader.inputFile = new File(ref);
    }

    /**
     * Method check Input File() check existence of
     * input File and if it isn't, create that one.
     */

    public static void checkInputFile() {

        if(!inputFile.exists()) {

            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                ExceptionsPrinter.printIOException();
            }

        }

    }

    /**
     * Method readNext() reading strings from input file
     *
     * @return string of triangle points
     */

    public static String readNext() {

        try {
            fileReader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(fileReader);
            return bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            ExceptionsPrinter.printFileNotFoundException(inputFile);
            return null;
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
            return null;
        }

    }

}
