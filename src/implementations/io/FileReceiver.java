package implementations.io;

import implementations.FocusStartApplication;
import implementations.abstracts.ExceptionsPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReceiver implements ExceptionsPrinter {

    public static FileReader fileReader;
    public static BufferedReader bufferedReader;

    public void inputStream() {
        try {
            this.fileReader = new FileReader(FocusStartApplication.inputFileName);
            this.bufferedReader = new BufferedReader(fileReader);
            FocusStartApplication.cornetString = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            printFileNotFoundException();
        } catch (IOException e) {
            printIOException();
        }

    }

}
