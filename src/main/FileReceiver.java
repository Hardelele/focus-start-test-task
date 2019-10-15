package main;

import java.io.*;

public class FileReceiver {

    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;

    public static void inputStream() {
        try {
            if (!FocusStartApplication.inputFile.exists()) {
                FocusStartApplication.inputFile.createNewFile();
            }
            fileReader = new FileReader(FocusStartApplication.inputFile);
            bufferedReader = new BufferedReader(fileReader);
            FocusStartApplication.cornetString = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            ExceptionsPrinter.printFileNotFoundException();
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
        }
    }

    public static void outputStream() {
        try {
            if (!FocusStartApplication.outputFile.exists()) {
                FocusStartApplication.outputFile.createNewFile();
            }
            fileWriter = new FileWriter(FocusStartApplication.outputFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(FocusStartApplication.cornetString);
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
        }
    }

    public static boolean inputStreamHasNext() {
        try {
            return bufferedReader.ready();
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
            return false;
        }
    }

    public static void close() {
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
        }
    }
}