package main;

public class ExceptionsPrinter {

    public static void printFileNotFoundException() {
        System.out.println("Не найден файл с именем: " + FocusStartApplication.inputFileName);
    }

    public static void printIOException() {
        System.out.println("При выводе в файл: '" + FocusStartApplication.outputFileName + "',- возникла ошибка");
    }

}
