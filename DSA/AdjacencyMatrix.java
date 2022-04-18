package DSA;

import java.util.*;
class Graph
{
    private int V;
    private int E;
    private int adjMatrix[][];

    Graph(int numberOfNodes)
    {
        this.V = numberOfNodes;
        this.E = 0;
        this.adjMatrix = new int[numberOfNodes][numberOfNodes];
    }

    public void addEdge(int u, int v)
    {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V).append(" vertices, ").append(E).append(" edges ").append("\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + 1).append(": ");
            for (int weight : adjMatrix[v]) {
                sb.append(weight).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class AdjacencyMatrix
{
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
}
