package java.implementation;

import java.interfaces.StringReceiver;

public class Console{

    public static String inputFileName, outputFileName;

    public static void askInputFile() {
        inputFileName = StringReceiver.input();
    }

    public static void askOutputFile() {
        outputFileName = StringReceiver.input();
    }

}
