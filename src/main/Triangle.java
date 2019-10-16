package main;

public class Triangle {

    private final static int countOfPoints = 3;

    private boolean isNull;

    private Point[] points = new Point[countOfPoints];

    Triangle() {
        setPoints0();
    }

    public void setPoints0() {
        for (int counter = 0; counter < countOfPoints; counter++) {
            isNull = true;
            points[counter].setX(0);
            points[counter].setY(0);
        }
    }
}
