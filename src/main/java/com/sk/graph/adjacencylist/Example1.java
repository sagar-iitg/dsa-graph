package com.sk.graph.adjacencylist;

import java.util.Arrays;
import java.util.HashSet;

public class Example1 {


    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,0}};
        System.out.println(Arrays.deepToString(edges));
        HashSet<Integer>[] graph=new HashSet[3];



        int i,j;
        for(i=0;i<3;i++){
            graph[i] = new HashSet<Integer>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        for(int k=0;k<3;k++)
            System.out.println(graph[k]);
    }
}
