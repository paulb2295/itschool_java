package session5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathFindingInMaze {

    public static void main(String[] args) {

        printInstructions();

        char[][] charMatrix = stringToCharMatrix();
        printMatrix(charMatrix);

        ArrayList<Node> nodes = getConnectedNodes(charMatrix);

        Graph graph = new Graph(graphNodesNumber(charMatrix));
        createGraphEdges(getGraphEdges(nodes), graph);

        printResolvedMaze(findStartingNode(nodes), findEndNode(nodes), charMatrix, graph, nodes);
    }


    public static void printInstructions() {
        System.out.println("Insert the maze you want to traverse line by line.");
        System.out.println("S is the starting point.");
        System.out.println("E is the finish point.");
        System.out.println("It is imperative to provide S and E!");
        System.out.println("1 represents a wall.");
        System.out.println("0 represents a open cell.");
        System.out.println("Any other input will be regarded as a wall.");
        System.out.println("Maze Example:");
        System.out.println(""" 
                S 1 1 1
                0 1 1 0
                0 0 1 1
                1 0 0 E""");
        System.out.println("!INPUT @ ON A NEW LINE AND PRESS ENTER TO STOP INPUT LINES!");
    }

    public static char[][] stringToCharMatrix() {

        int lineLength = 0;
        int rowLength = 0;
        String bufferInputLine;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStringsArray = new ArrayList<String>();
        String inputLine;
        do {
            System.out.println("Enter the next line of the maze:");
            inputLine = scanner.nextLine();
            if (!inputLine.equals("@")) {
                inputStringsArray.add(inputLine.replaceAll("\\s", ""));
            }
        } while (!inputLine.equals("@"));
        for (String element : inputStringsArray) {
            int inputLength = element.length();
            lineLength = inputLength > lineLength ? inputLength : lineLength;
        }
        rowLength = inputStringsArray.size();
        int matrixDimension = lineLength > rowLength ? lineLength : rowLength;
        char[][] charMatrix = new char[matrixDimension][matrixDimension];
        initializeMatrixWithOne(charMatrix);
        int lineCounter = 0;
        for (String element : inputStringsArray) {
            char[] container = new char[matrixDimension];
            for (int rowCounter = 0; rowCounter < matrixDimension; rowCounter++) {
                container = element.toCharArray();
                invalidCharReplacer(container);
                if (element.length() < (matrixDimension)) {
                    int lengthDifference = element.length() - matrixDimension;
                    for (int index = (matrixDimension - lengthDifference - 1); index < container.length; index++) {
                        container[index] = '1';
                    }
                }
            }
            for (int rowCounter = 0; rowCounter < container.length; rowCounter++) {
                charMatrix[lineCounter][rowCounter] = container[rowCounter];
            }
            lineCounter++;
        }
        scanner.close();

        return charMatrix;
    }

    public static void printMatrix(char[][] matrix) {
        System.out.println("Adjusted inserted Maze:");
        for (int lineCounter = 0; lineCounter < matrix.length; lineCounter++) {
            for (int rowCounter = 0; rowCounter < matrix.length; rowCounter++) {
                System.out.print(matrix[lineCounter][rowCounter] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initializeMatrixWithOne(char[][] matrix) {
        for (int lineCounter = 0; lineCounter < matrix.length; lineCounter++) {
            for (int rowCounter = 0; rowCounter < matrix.length; rowCounter++) {
                matrix[lineCounter][rowCounter] = '1';
            }
        }
    }

    public static void invalidCharReplacer(char[] charArray) {
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] != '1'
                    && charArray[index] != '0'
                    && charArray[index] != 'E'
                    && charArray[index] != 'e'
                    && charArray[index] != 'S'
                    && charArray[index] != 's') {
                charArray[index] = '1';
            }
        }
    }

    public static ArrayList getConnectedNodes(char[][] charMatrix) {
        ArrayList<Node> nodes = new ArrayList<>();
        for (int lineIndex = 0; lineIndex < charMatrix.length; lineIndex++) {
            for (int rowIndex = 0; rowIndex < charMatrix.length; rowIndex++) {
                int nodeName;
                int[] nodeAdjacency = {-1, -1, -1, -1};
                int indexAdjacency = 0;
                boolean isStart;
                boolean isFinish;
                if (charMatrix[lineIndex][rowIndex] == '0'
                        || charMatrix[lineIndex][rowIndex] == 'E'
                        || charMatrix[lineIndex][rowIndex] == 'e'
                        || charMatrix[lineIndex][rowIndex] == 's'
                        || charMatrix[lineIndex][rowIndex] == 'S') {

                    nodeName = nodeNameNormalizer(lineIndex, rowIndex, charMatrix.length);

                    if (lineIndex > 0 && (charMatrix[lineIndex - 1][rowIndex] == '0'
                            || charMatrix[lineIndex - 1][rowIndex] == 'E'
                            || charMatrix[lineIndex - 1][rowIndex] == 'e'
                            || charMatrix[lineIndex - 1][rowIndex] == 's'
                            || charMatrix[lineIndex - 1][rowIndex] == 'S')) {
                        nodeAdjacency[indexAdjacency] = nodeNameNormalizer(lineIndex - 1, rowIndex, charMatrix.length);
                        indexAdjacency++;
                    }
                    if (lineIndex < charMatrix.length - 1 && (charMatrix[lineIndex + 1][rowIndex] == '0'
                            || charMatrix[lineIndex + 1][rowIndex] == 'E'
                            || charMatrix[lineIndex + 1][rowIndex] == 'e'
                            || charMatrix[lineIndex + 1][rowIndex] == 's'
                            || charMatrix[lineIndex + 1][rowIndex] == 'S')) {
                        nodeAdjacency[indexAdjacency] = nodeNameNormalizer(lineIndex + 1, rowIndex, charMatrix.length);
                        indexAdjacency++;
                    }
                    if (rowIndex > 0 && (charMatrix[lineIndex][rowIndex - 1] == '0'
                            || charMatrix[lineIndex][rowIndex - 1] == 'E'
                            || charMatrix[lineIndex][rowIndex - 1] == 'e'
                            || charMatrix[lineIndex][rowIndex - 1] == 's'
                            || charMatrix[lineIndex][rowIndex - 1] == 'S')) {
                        nodeAdjacency[indexAdjacency] = nodeNameNormalizer(lineIndex, rowIndex - 1, charMatrix.length);
                        indexAdjacency++;
                    }
                    if (rowIndex < charMatrix.length - 1 && (charMatrix[lineIndex][rowIndex + 1] == '0'
                            || charMatrix[lineIndex][rowIndex + 1] == 'E'
                            || charMatrix[lineIndex][rowIndex + 1] == 'e'
                            || charMatrix[lineIndex][rowIndex + 1] == 's'
                            || charMatrix[lineIndex][rowIndex + 1] == 'S')) {
                        nodeAdjacency[indexAdjacency] = nodeNameNormalizer(lineIndex, rowIndex + 1, charMatrix.length);
                        indexAdjacency++;
                    }

                    switch (charMatrix[lineIndex][rowIndex]) {
                        case '0' -> {
                            isStart = false;
                            isFinish = false;
                        }
                        case 'S', 's' -> {
                            isStart = true;
                            isFinish = false;
                        }
                        case 'E', 'e' -> {
                            isStart = false;
                            isFinish = true;
                        }
                        default ->
                                throw new IllegalStateException("Unexpected value: " + charMatrix[lineIndex][rowIndex]);
                    }
                    Node node = new Node(nodeName, nodeAdjacency, isStart, isFinish);
                    nodes.add(node);
                }
            }
        }
        return nodes;
    }

    public static int nodeNameNormalizer(int line, int row, int length) {
        int firstParameter = line;
        int secondParameter = row;
        if (firstParameter < 0) {
            firstParameter = 0;
        }
        if (secondParameter < 0) {
            secondParameter = 0;
        }
        return line * length + row;
    }

    public static void printNodes(ArrayList<Node> nodes) {
        for (Node node : nodes) {
            System.out.println("Node name: " + node.getNodeName());
            int[] adjacency = node.getNodeAdjacency();
            System.out.print("Node Adjacencies: ");
            for (int index = 0; index < adjacency.length; index++) {
                System.out.print(adjacency[index] + " ");
            }
            System.out.println();
            System.out.println("Is starting node: " + node.getIsStart());
            System.out.println("Is end node: " + node.getIsFinish());
            System.out.println("====================================");
        }
    }


    public static int graphNodesNumber(char[][] charArray) {
        return (charArray.length) * (charArray.length);
    }

    public static ArrayList getGraphEdges(ArrayList<Node> nodes) {
        ArrayList<String> edges = new ArrayList<>();
        int[] bufferArray = new int[4];
        for (Node node : nodes) {
            bufferArray = node.getNodeAdjacency();
            for (int index : bufferArray) {
                if (index != -1) {
                    String edge = String.valueOf(node.getNodeName());
                    edge += ",";
                    edge += String.valueOf(index);
                    edges.add(edge);
                    edge = "";
                }
            }
        }
        return edges;
    }

    public static void printEdges(ArrayList<String> edges) {
        for (String vertex : edges) {
            System.out.println(vertex);
        }
    }

    public static void createGraphEdges(ArrayList<String> edges, Graph graph) {
        for (String edge : edges) {
            String[] parts = edge.split(",");
            String headEdge = parts[0];
            String tailEdge = parts[1];
            graph.addEdge(Integer.parseInt(headEdge), (Integer.parseInt(tailEdge)));
        }
    }


    public static int findStartingNode(ArrayList<Node> nodes) {
        for (Node node : nodes) {
            if (node.getIsStart()) {
                return node.getNodeName();
            }
        }
        return 0;
    }

    public static int findEndNode(ArrayList<Node> nodes) {
        for (Node node : nodes) {
            if (node.getIsFinish()) {
                return node.getNodeName();
            }
        }
        return 0;
    }

    public static void printResolvedMaze(int startingPoint, int endPoint, char[][] charMatrix, Graph graph, ArrayList<Node> nodes) {
        try {
            System.out.println("Resolved Maze:");
            List<Integer> path = graph.findPath(startingPoint, endPoint);
            for (Node node : nodes) {
                for (int nodeInPath : path) {
                    if (node.getNodeName() == nodeInPath
                            && !node.getIsStart()
                            && !node.getIsFinish()) {
                        int lineIndex = returnLineIndexOfNode(nodeInPath, charMatrix.length);
                        int rowIndex = returnColumnIndexOfNode(nodeInPath, charMatrix.length);
                        charMatrix[lineIndex][rowIndex] = '*';
                    }
                }
            }
            for (int lineCounter = 0; lineCounter < charMatrix.length; lineCounter++) {
                for (int rowCounter = 0; rowCounter < charMatrix.length; rowCounter++) {
                    System.out.print(charMatrix[lineCounter][rowCounter] + " ");
                }
                System.out.println();
            }
        } catch (Exception exception) {
            System.out.println("The maze has no solution");
        }
    }

    public static int returnLineIndexOfNode(int nodeName, int matrixLength) {
        return nodeName / matrixLength;
    }

    public static int returnColumnIndexOfNode(int nodeName, int matrixLength) {
        return nodeName % matrixLength;
    }
}
