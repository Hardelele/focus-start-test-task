package main.algorithms;

import main.FocusStartApplication;
import main.io.FileReceiver;
import main.objects.TrianglesStorage;
import java.util.StringTokenizer;

public class StringConverter extends FileReceiver {

    private static StringTokenizer tokenizer;

    public static int counterForNodes = 0;

    public static void saveTriangleProps() {
        tokenizer = new StringTokenizer(FocusStartApplication.cornetString," ");
        double cornetX,cornetY;

        while(tokenizer.hasMoreTokens()) {

            cornetX = Double.parseDouble(tokenizer.nextToken());
            cornetY = Double.parseDouble(tokenizer.nextToken());

            TrianglesStorage.createNewTriangle();
            TrianglesStorage.saveNodes(cornetX,cornetY,counterForNodes);
            TrianglesStorage.calculateS();
            TrianglesStorage.calculateAndSaveRibs();

            counterForNodes++;
        }
    }
}
