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

    private static ArrayList<IsoscelesTriangle> triangles = new ArrayList<>();

    public static void getAndSaveTriangleNodes() {
        StringTokenizer tokenizer = new StringTokenizer(FocusStartApplication.cornetString," ");
        double tokenX,tokenY;

        while(tokenizer.hasMoreTokens()) {
            tokenX = Double.parseDouble(tokenizer.nextToken());
            tokenY = Double.parseDouble(tokenizer.nextToken());
            triangles.add(new IsoscelesTriangle());
            triangles.get(counter).setTriangleNodesCoords(tokenX,tokenY);
            triangles.get(counter).calculateS();
            counter++;
        }

    }

}
