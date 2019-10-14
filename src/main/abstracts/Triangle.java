package main.abstracts;

import main.objects.Node;

public interface Triangle {

    Node[] nodes = new Node[3];

    void calculateS();
    double getS();

    default double ribLength(Node firstNode, Node secondNode) {

        double lengthX = Math.abs(firstNode.getX() - secondNode.getX());
        double lengthY = Math.abs(firstNode.getY() - secondNode.getY());
        double diagonalLength = getDiagonalLength(lengthX,lengthY);

        return diagonalLength;
    }

    default double getSumOfSqrLengths(double rib1, double rib2) {
        return Math.pow(rib1,2) + Math.pow(rib2,2);
    }

    default double getDiagonalLength(double rib1, double rib2) {
        return Math.sqrt(getSumOfSqrLengths(rib1,rib2));
    }

}
