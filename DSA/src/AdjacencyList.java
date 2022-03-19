/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;

class Graph
{
    int numVertices;
    ArrayList<Integer> adjList[];
}


public class AdjacencyList 
{
    static Scanner Sc = new Scanner(System.in);
    
    public void addEdge(ArrayList<ArrayList<Integer>> AL, int x, int y)
    {
        AL.get(x).add(y);
        AL.get(y).add(x);
    }
    
    public void printGraph(ArrayList<ArrayList<Integer>> AL, int arr[])
    {
        for(int i = 0; i < AL.size(); i++)
        {
            System.out.print("Vertex " + i + ":");
            for(int j = 0; j<AL.get(arr[i]).size(); j++)
            {
                System.out.print(" -> " + AL.get(i).get(j));
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String args[])
    {
        AdjacencyList obj = new AdjacencyList();
        System.out.println("Enter Number of Vertices: ");
        int V = Sc.nextInt();
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);
        int vertices[] = new int[V];
        for(int i = 0; i < V; i++)
        {
            System.out.println("Enter value of vertice " + (i+1));
            vertices[i] = Sc.nextInt();
        }
        for(int i = 0; i < V; i++)
        {
            AL.add(new ArrayList<>());
        }
        for(int i = 0; i < V; i++)
        {
            System.out.println("Enter edge " + (i+1) + " Enter both the nodes, 'x & 'y");
            int x = Sc.nextInt();
            int y = Sc.nextInt();
            obj.addEdge(AL, x, y);
        }
        System.out.println("Graph is as follows");
        obj.printGraph(AL, vertices);
    }
}
