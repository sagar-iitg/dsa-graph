package com.sk.graph.traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;




class BFS {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here


        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();

        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){

            int curr=q.remove();
            ans.add(curr);

            for(int i=0;i<adj.get(curr).size();i++)
            {
                int s=adj.get(curr).get(i);

                if(visited[s]==false)
                {
                    q.add(s);
                    visited[s]=true;
                }
            }

        }
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());

        while(T-->0){


            String[] s=br.readLine().trim().split(" ");
            int V=Integer.parseInt(s[0]);
            int E=Integer.parseInt(s[1]);

            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<V;i++) adj.add(i, new ArrayList<Integer>());
            for(int i=0;i<E;i++) {
                String[] S=br.readLine().trim().split(" ");
                int u=Integer.parseInt(S[0]);
                int v=Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }

            BFS obj=new BFS();
            ArrayList<Integer> ans=obj.bfsOfGraph(V,adj);
            for(int i=0;i<ans.size();i++)
                System.out.println(ans.get(i)+" ");

            System.out.println();




        }

    }
}


