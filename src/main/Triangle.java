package main;

import java.util.StringTokenizer;

public class Triangle {

    private final static int countOfPoints = 3;

    private double S;

    private boolean isNull;

    private Point[] points = new Point[countOfPoints];

    /**
     * Constructor Triangle() without params
     * Create empty Triangle: S = 0, points[any] = 0, flag isNull = true.
     */

    public Triangle() {
        isNull = true;
        setPointsAs0();
        S = 0;
    }

    /**
     * Constructor Triangle() with stringTriangle param setting points from string in array of points[],
     * and after calculate ribs and S for this triangle
     *
     * @param stringTriangle it is string of 6 points
     */

    public Triangle(String stringTriangle) {
        setPoints(stringTriangle);
    }

    /**
     * Method setPoints0 used for set all points of triangle as 0
     */

    private void setPointsAs0() {

        for (int counter = 0; counter < countOfPoints; counter++) {
            points[counter].setX(0);
            points[counter].setY(0);
        }

    }

    /**
     * @Override method toString(), that convert object triangle to string
     *
     * @return string of 6 points (coords of triangle)
     */

    @Override
    public String toString() {

        String stringTriangle = null;

        for (int counter = 0; counter < countOfPoints; counter++) {
            stringTriangle += points[counter].getX() + " " + points[counter].getY() + " ";
        }

        return stringTriangle;
    }

    public double getS() {
        return S;
    }

    /**
     * Method setPoints take stringTriangle and parse it in points[]
     *
     * @param stringTriangle it is string of 6 points
     */

    private void setPoints(String stringTriangle) {

        StringTokenizer tokenizer = new StringTokenizer(stringTriangle," ");
        double cornetX, cornetY;

        int counter = 0;

        while (tokenizer.hasMoreTokens()) {
            cornetX = Double.parseDouble(tokenizer.nextToken());
            points[counter].setX(cornetX);

            cornetY = Double.parseDouble(tokenizer.nextToken());
            points[counter].setY(cornetY);

            counter++;
        }

    }

    /**
     * Method calculateS()
     */

    private void calculateS() {

    }

}
