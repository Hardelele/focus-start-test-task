package main;

/*
TODO:: Конвертацию из стоки в треугольник и обратно.
 */

import java.util.StringTokenizer;

public class Converter {

    private static StringTokenizer tokenizer;

    public static Triangle parseStringToTriangle(String string) {
        tokenizer = new StringTokenizer(string," ");
        double cornetX, cornetY;

        int nodeId = 0;

        Triangle triangle = new Triangle();

        while (tokenizer.hasMoreTokens()) {
            cornetX = Double.parseDouble(tokenizer.nextToken());
            cornetY = Double.parseDouble(tokenizer.nextToken());

            triangle.setNode(nodeId,cornetX,cornetY);

            nodeId++;
        }

        return triangle;
    }

    public static String parseTriangleToString(Triangle triangle) {

        String string = null;

        for (int counter = 0; counter < 3; counter++) {
            string += triangle.getNode(counter).getX() + " " + triangle.getNode(counter).getY() + " ";
        }

        return string;
    }

}
