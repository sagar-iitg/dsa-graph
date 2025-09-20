package com.sk.graph.bfs;

import java.util.*;

public class BFS {

    public static void main(String[] args) {

        List<List<Integer>> adj=new ArrayList<>();
        adj.add(List.of(1, 2));
        adj.add(List.of(0, 2, 3));
        adj.add(List.of(0, 4));
        adj.add(List.of(1,4));
        adj.add(List.of(2,3));
        System.out.println(adj);
        List<Integer> ans=new ArrayList<>();
        bfs(adj,ans);
        System.out.println(ans);
    }

    static void bfs(List<List<Integer>> adj,List<Integer> ans){


        int v=adj.size(); //no of vertices
        boolean[] visited=new boolean[v];
        Deque<Integer> q=new ArrayDeque<>();
        q.addLast(0);//source node
        visited[0]=true;
        for(int i=0;i<v;i++){

            while (!q.isEmpty()){
                int node = q.removeFirst();
                ans.add(node);
                for(int n:adj.get(node)){

                    if(visited[n]==false){
                        q.addLast(n);
                        visited[n]=true;
                    }
                }
            }

        }

    }
}
