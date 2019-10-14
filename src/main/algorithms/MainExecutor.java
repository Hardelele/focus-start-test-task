package main.algorithms;

import main.FocusStartApplication;
import main.io.FileReceiver;
import main.objects.IsoscelesTriangle;
import main.objects.Node;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainExecutor extends FileReceiver {

    private static StringTokenizer tokenizer;

    public static int counter = 0;

    public static ArrayList<IsoscelesTriangle> triangles = new ArrayList<>();

    public static void saveTriangleProps() {
        tokenizer = new StringTokenizer(FocusStartApplication.cornetString," ");
        double cornetX,cornetY;

        while(tokenizer.hasMoreTokens()) {

            cornetX = Double.parseDouble(tokenizer.nextToken());
            cornetY = Double.parseDouble(tokenizer.nextToken());

            createNewTriangle();
            saveNodes(cornetX,cornetY);
            calculateS();
            calculateAndSaveRibs();

            counter++;
        }

    }

    private static void createNewTriangle() {
        triangles.add(new IsoscelesTriangle());
    }

    private static void saveNodes(double x, double y) {
        triangles.get(counter).setTriangleNodesCoords(x,y);
    }

    private static void calculateS() {
        triangles.get(counter).calculateS();
    }

    private static void calculateAndSaveRibs() {
        triangles.get(counter).calculateAndSaveLengthOfRibs();
    }

}
