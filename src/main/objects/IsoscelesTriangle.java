package main.objects;

import main.abstracts.Triangle;

public class IsoscelesTriangle implements Triangle {

    @Override
    public void calculateS() {

    }

    @Override
    public double getS() {
        return 0;
    }

    public void setTriangleNodesCoords(double x, double y) {
        for (int counter = 0; counter < 3; counter++) {
            nodes[counter] = new Node();
            nodes[counter].setX(x);
            nodes[counter].setY(y);
        }
    }

}
