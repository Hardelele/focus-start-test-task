package main.abstracts;

import main.FocusStartApplication;

public interface ExceptionsPrinter {

    default void printFileNotFoundException() {
        System.out.println("Не найден файл с именем: " + FocusStartApplication.inputFileName);
    }

    default void printIOException() {
        System.out.println("При выводе в файл: '" + FocusStartApplication.outputFileName + "',- возникла ошибка");
    }

}
