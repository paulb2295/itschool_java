package session5.homework;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final boolean[][] adjacencyMatrix;
    private final int numberOfVertices;

    public Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyMatrix = new boolean[numberOfVertices][numberOfVertices];

    }

    public void addEdge(int nodeOne, int nodeTwo) {
        adjacencyMatrix[nodeOne][nodeTwo] = true;
    }

    public void removeEdge(int nodeOne, int nodeTwo) {
        adjacencyMatrix[nodeOne][nodeTwo] = false;
        adjacencyMatrix[nodeTwo][nodeOne] = false;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int lineIndex = 0; lineIndex < numberOfVertices; lineIndex++) {
            string.append(lineIndex + ": ");
            for (boolean rowIndex : adjacencyMatrix[lineIndex]) {
                string.append((rowIndex ? 1 : 0) + " ");
            }
            string.append("\n");
        }
        return string.toString();
    }

    public List<Integer> findPath(int start, int finish) {
        boolean[] visited = new boolean[numberOfVertices];
        List<Integer> path = new ArrayList<>();

        depthFirstSearch(adjacencyMatrix, start, finish, visited, path);

        if (path.get(path.size() - 1) != finish) {
            path.clear();
        }

        return path;
    }

    private boolean depthFirstSearch(boolean[][] graph, int current, int finish, boolean[] visited, List<Integer> path) {
        visited[current] = true;
        path.add(current);

        if (current == finish) {
            return true;
        }

        for (int neighbor = 0; neighbor < graph.length; neighbor++) {
            if (graph[current][neighbor] && !visited[neighbor]) {
                if (depthFirstSearch(graph, neighbor, finish, visited, path)) {
                    return true;
                }
            }
        }

        path.remove(path.size() - 1);
        return false;
    }

}
