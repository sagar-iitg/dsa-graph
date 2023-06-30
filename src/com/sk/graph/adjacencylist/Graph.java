package com.sk.graph.adjacencylist;

import java.util.*;


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
    void bfs(int src,boolean[] vis)
    {

        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        vis[src]=true;
        while (!q.isEmpty())
        {
            int curr=q.remove();
            System.out.print(curr+" ");
//            for(int i=0;i<graph.get(curr).size();i++)
//            {   int s=graph.get(curr).get(i);
//                if(vis[s]==false)
//                {
//                    q.add(s);
//                    vis[s]=true;
//                }
//            }

            for(Integer s:graph.get(curr))
            {
                if(vis[s]==false)
                {
                    q.add(s);
                    vis[s]=true;
                }
            }
        }

    }
    private void dfs(int src, boolean[] vis) {

        System.out.print(src+" ");
        vis[src]=true;

        for(Integer s:graph.get(src))
        {
            if(vis[s]==false)
            {
                dfs(s,vis);

            }
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
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i]==false)
                graph.bfs(i,vis);
        }

        System.out.println();

        System.out.println("dfs traversal");

        boolean[] vis2=new boolean[v];
        for(int i=0;i<v;i++){
            if(vis2[i]==false)
                graph.dfs(i,vis);
        }


    }



}
