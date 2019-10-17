package main;

public class Rib {

    private double length;

    /*
    public Rib() {
        setLengthAs0();
    }

    private void setLengthAs0() {
        length = 0;
    }
    */


    public Rib(Point point1, Point point2) {
        setLength(point1, point2);
    }

    private void setLength(Point point1, Point point2) {
        double width = Math.abs(point1.getX() - point2.getX());
        double height = Math.abs(point1.getY() - point2.getY());
        length = Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
    }

    public double getLength() {
        return length;
    }

}
