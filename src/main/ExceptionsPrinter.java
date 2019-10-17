package main;

import java.io.File;

public class ExceptionsPrinter {

    public static void printFileNotFoundException(File file) {
        System.err.println("Файл " + file + " не найден!");
    }

    public static void printIOException() {
        System.err.println("Ошибка ввода/вывода!");
    }

}
