package main.objects;

import main.abstracts.Triangle;

public class IsoscelesTriangle implements Triangle {

    private Double S, rib1, rib2, rib3;
    private String flag;

    public void calculateAndSaveLengthOfRibs() {
        rib1 = ribLength(nodes[0],nodes[1]);
        rib2 = ribLength(nodes[1],nodes[2]);
        rib3 = ribLength(nodes[2],nodes[0]);
    }

    @Override
    public void calculateS() {
        double baseOfTriangle = getBaseOfTriangle();
        switch (flag) {
            case "rib1":
                this.S = Math.sqrt(Math.pow(rib2,2)-Math.pow(baseOfTriangle/2,2));
                break;
            case "rib2":
            case "rib3":
                this.S = Math.sqrt(Math.pow(rib1,2)-Math.pow(baseOfTriangle/2,2));
                break;
            default:
                break;
        }
    }

    @Override
    public double getS() {
        return this.S;
    }

    public void setTriangleNodesCoords(double x, double y) {
        for (int counter = 0; counter < 3; counter++) {
            nodes[counter] = new Node();
            nodes[counter].setX(x);
            nodes[counter].setY(y);
        }
    }

    public double getBaseOfTriangle() {
        if (rib1.equals(rib2)) {
            flag = "rib3";
            return rib3;
        } else if (rib2.equals(rib3)) {
            flag = "rib1";
            return rib1;
        } else if (rib3.equals(rib1)){
            flag = "rib2";
            return rib2;
        } else {
            flag = "it's not isosceles triangle!";
            return 0;
        }
    }

}
