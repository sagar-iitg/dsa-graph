package com.sk.graph.traversal;

import java.util.ArrayList;

public class DFSAlgo {

    public static void dfs(int v){

    }

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        int v=9;
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        System.out.println(adjList);
        adjList.get(1).add(2);
        adjList.get(1).add(3);

        adjList.get(2).add(1);
        adjList.get(2).add(5);
        adjList.get(2).add(6);

        adjList.get(3).add(1);
        adjList.get(3).add(4);
        adjList.get(3).add(7);

        adjList.get(4).add(3);
        adjList.get(4).add(8);

        adjList.get(5).add(2);
        adjList.get(6).add(2);

        adjList.get(7).add(3);
        adjList.get(7).add(8);

        adjList.get(8).add(4);
        adjList.get(8).add(7);





        System.out.println(adjList);

    }
}
