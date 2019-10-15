package main;

public class Triangle {

    private Node[] nodes = new Node[3];
    private Double[] ribs = new Double[3];
    private Double S = null;
    private String flag = null;

    public void setNode(int id, double x, double y) {
        nodes[id] = new Node(x,y);
    }

    public double getS() {
        calculateS();
        return this.S;
    }

    private void calculateS() {
        calculateAllRibs();
        double bottom = getBottom();
        if (flag != null) {
            double height = getHeight();
            this.S = height*bottom/2;
        }
    }

    private void calculateAllRibs() {
        ribs[0] = getRib(nodes[0],nodes[1]);
        ribs[1] = getRib(nodes[1],nodes[2]);
        ribs[2] = getRib(nodes[2],nodes[0]);
    }

    private double getBottom() {
        if(ribs[0]==ribs[1]) {
            flag = "rib2";
            return ribs[2];
        } else if(ribs[1]==ribs[2]) {
            flag = "rib0";
            return ribs[0];
        } else if(ribs[2]==ribs[0]) {
            flag = "rib1";
            return ribs[1];
        } else {
            flag = null;
            return 0;
        }
    }

    private double getRib(Node node1, Node node2) {
        double lengthX = Math.abs(node1.getX() - node2.getX());
        double lengthY = Math.abs(node1.getY() - node2.getY());
        double diagonal = getDiagonal(lengthX,lengthY);

        return diagonal;
    }

    private double getDiagonal(double rib1, double rib2) {
        return Math.sqrt(getSumOfSqr(rib1,rib2));
    }

    private double getSumOfSqr(double rib1, double rib2) {
        return Math.pow(rib1,2) + Math.pow(rib2,2);
    }

    private double getHeight() {
        double height = 0;
        switch (flag) {
            case "rib1":
                height = Math.sqrt(Math.pow(ribs[2],2)-Math.pow(getBottom()/2,2));
                break;
            case "rib2":
            case "rib3":
                height = Math.sqrt(Math.pow(ribs[1],2)-Math.pow(getBottom()/2,2));
                break;
        }
        return height;
    }

}
