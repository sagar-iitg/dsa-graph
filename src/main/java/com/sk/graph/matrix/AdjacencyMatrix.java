package com.sk.graph.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {

    public static void main(String[] args) {

        int n;
        System.out.println("Enter no of nodes: n");
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        int[][] adj=new int[n][n];
        System.out.println(Arrays.deepToString(adj));

        int e;
        System.out.println("Enter no of edges");
        e=sc.nextInt();
        for (int i=0;i<e;i++)
        {
            int u,v;
            u=sc.nextInt();
            v=sc.nextInt();
            adj[u][v]=1;


        }
        System.out.println(Arrays.deepToString(adj));




    }
}
