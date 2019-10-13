package java.interfaces;

import java.util.Scanner;

public interface StringReceiver {
    static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
