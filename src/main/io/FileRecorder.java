package main.io;

import main.FocusStartApplication;
import main.abstracts.ExceptionsPrinter;

import java.io.*;

public class FileRecorder implements ExceptionsPrinter {

    public void outputStream() {
        try {
            FileWriter fileWriter = new FileWriter(FocusStartApplication.outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            printIOException();
        }
    }

}
