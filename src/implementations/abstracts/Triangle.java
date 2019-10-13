package implementations.abstracts;

import implementations.objects.Node;

public interface Triangle {

    public Node[] nodes = new Node[3];

    void calculateS();
    double getS();

}
