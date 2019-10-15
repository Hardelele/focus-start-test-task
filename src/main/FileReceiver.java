package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReceiver {

    public static FileReader fileReader;
    public static BufferedReader bufferedReader;

    public static void inputStream() {
        try {
            fileReader = new FileReader(FocusStartApplication.inputFileName);
            bufferedReader = new BufferedReader(fileReader);
            FocusStartApplication.cornetString = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            ExceptionsPrinter.printFileNotFoundException();
        } catch (IOException e) {
            ExceptionsPrinter.printIOException();
        }
    }

    public static void outputStream() {
        System.out.println();
    }

}