/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphs;

/**
 *
 * @author shvmt
 */
import java.util.*;
class Graph
{
    private int V;//no. of vertices
    private int E;//no. of edges
    private int[][] adjMatrix;
    
    public Graph(int numberOfNodes)
    {
        this.V = numberOfNodes;
        this.E = 0;
        this.adjMatrix = new int[numberOfNodes][numberOfNodes];
    }
    
    public void addEdge(int u, int v)
    {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;//can be the weight in case of a weighted graph
        E++;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V).append(" vertices, ").append(E).append(" edges \n");
        for(int v = 0; v < V; v++)
        {
            sb.append(v).append(": ");
            for(int weight: adjMatrix[v])//iterates through the adjMatrix of each Vertice
            {
                sb.append(weight).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class AdjcacencyMatrix 
{
    
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g.toString());
    }
    
}
