package main;

public class MainExecutor {

    private static Triangle cornetTriangle;

    private static Triangle maxSTriangle;

    public static void run() {
        FileReceiver.inputStream();
        cornetTriangle = Converter.parseStringToTriangle(FocusStartApplication.cornetString);

        if(maxSTriangle.getS() < cornetTriangle.getS()) {
            maxSTriangle = cornetTriangle;
        } //TODO::Если equal() = true.

        FocusStartApplication.cornetString = String.valueOf(maxSTriangle.getS());
        FileReceiver.outputStream();
    }

}
