package main.objects;

import java.util.ArrayList;

/*
TODO:: класс TrianglesStorage должен использоваться классом TrianglesSerializer для сохранения в памяти в виде сериализованных обьектов.
 */

public class TrianglesStorage {

    public static ArrayList<IsoscelesTriangle> triangles = new ArrayList<>();

    public static void createNewTriangle() {
        triangles.add(new IsoscelesTriangle());
    }

    public static void saveNodes(double x, double y, int counterForNodes) {
        triangles.get(triangles.size()).setTriangleNodesCoords(x,y,counterForNodes);
    }

    public static void calculateS() {
        triangles.get(triangles.size()).calculateS();
    }

    public static void calculateRibs() {
        triangles.get(triangles.size()).calculateLengthOfRibs();
    }

}
