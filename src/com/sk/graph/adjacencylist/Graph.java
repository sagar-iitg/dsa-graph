package com.sk.graph.adjacencylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Graph {


    HashMap<Integer, ArrayList<Integer>> graph;
    static int v;
    // Graph Constructor
    public Graph()
    {
        graph = new HashMap<>();
        for (int i = 0; i < v; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
    }
    void addEdge(int u,int v){

        // Add an edge from src to dest into the set
        graph.get(u).add(v);

        // Since graph is undirected, add an edge
        // from dest to src into the set
        graph.get(v).add(u);

    }

    // A utility function to print the graph
    public void printGraph()
    {
        for (int i=0;i<graph.size();i++) {
            System.out.println(i+" -> "+ graph.get(i));
        }
    }
    public static void main(String[] args) {
        v = 5;
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency list representation of
        // the above graph
        graph.printGraph();
    }


}
