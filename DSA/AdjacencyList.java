package DSA;
import java.util.*;

class Graphs
{
    private int V;
    private int E;
    private ArrayList<Integer>[] adj;

    Graphs(int numberOfNodes)
    {
        this.V = numberOfNodes;
        this.E = 0;
        this.adj = new ArrayList[numberOfNodes];
        for(int v = 0; v < V; v++)
        {
            adj[v] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v)
    {
        adj[v].add(u);
        adj[u].add(v);
        E++;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V).append(" vertices, ").append(E).append(" edges ").append("\n");
        for(int v = 0; v < V; v++)
        {
            sb.append((v+1)).append(": ");//instead of v, we can use values of nodes as well
            for(int weight : adj[v])
            {
                sb.append(weight).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class AdjacencyList
{
    public static void main(String args[])
    {
        Graphs g = new Graphs(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
