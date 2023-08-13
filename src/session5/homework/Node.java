package session5.homework;

public class Node {
    private final int nodeName;
    private final int[] nodeAdjacency;
    private final boolean isStart;
    private final boolean isFinish;


    Node(int nodeName, int[] nodeAdjacency, boolean isStart, boolean isFinish) {
        this.nodeName = nodeName;
        this.nodeAdjacency = nodeAdjacency;
        this.isStart = isStart;
        this.isFinish = isFinish;
    }


    int getNodeName() {
        return nodeName;
    }

    int[] getNodeAdjacency() {
        return nodeAdjacency;
    }

    boolean getIsStart() {
        return isStart;
    }

    boolean getIsFinish() {
        return isFinish;
    }


}
