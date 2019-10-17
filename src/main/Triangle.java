package main;

import java.util.StringTokenizer;

public class Triangle {

    public final static int countOfPoints = 3;
    public final static int countOfRibs = 3;

    private double S, base, height;

    private Point[] points = new Point[countOfPoints];

    private Rib[] ribs = new Rib[countOfRibs];

    /**
     * Constructor Triangle() without params
     * Create empty Triangle: S = 0, points[any] = 0, flag isNull = true.
     */

    public Triangle() {
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
        setPointsAs0();
        setPoints(stringTriangle);
        setRibs();
        calculateBaseAndHeight();
        calculateS();
    }

    /**
     * Method setPoints0 used for set all points of triangle as 0
     */

    private void setPointsAs0() {

        for (int counter = 0; counter < countOfPoints; counter++) {
            points[counter] = new Point(0,0);
        }

    }

    /**
     * @Override method toString(), that convert object triangle to string
     *
     * @return string of 6 points (coords of triangle)
     */

    @Override
    public String toString() {

        String stringTriangle = "";

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

            if (tokenizer.hasMoreTokens()){
                cornetY = Double.parseDouble(tokenizer.nextToken());
                points[counter].setY(cornetY);
            }

            counter++;
        }

    }

    /**
     * Method calculateS()
     */

    private void calculateS() {
        S = base * height;
    }

    /**
     * Method setRibs() fill array of ribs
     */

    private void setRibs() {
        ribs[0] = new Rib(points[0],points[1]);
        ribs[1] = new Rib(points[1],points[2]);
        ribs[2] = new Rib(points[2],points[0]);
    }

    /**
     * Method setBaseAndHeight() compare ribs and if finds equal
     * calculate and set Base and Height of triangle
     */

    private void calculateBaseAndHeight() {

        if (ribs[0].equals(ribs[1])) {
            base = ribs[2].getLength();
            height = calculateHeight(ribs[0].getLength(),base);
        } else if (ribs[1].equals(ribs[2])) {
            base = ribs[0].getLength();
            height = calculateHeight(ribs[1].getLength(),base);
        } else if (ribs[2].equals(ribs[0])) {
            base = ribs[1].getLength();
            height = calculateHeight(ribs[2].getLength(),base);
        } else {
            base = 0;
            height = 0;
        }

    }

    /**
     * Method calculateHeight() get height from diagonal^2 = height^2 + width^2
     *
     * @param rib one side of triangle
     * @param base double value - base of triangle
     * @return
     */

    private double calculateHeight(double rib, double base) {
        return Math.sqrt(Math.pow(rib,2)-Math.pow((base/2),2));
    }
}
