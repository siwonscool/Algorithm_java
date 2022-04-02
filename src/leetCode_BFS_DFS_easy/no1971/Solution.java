package leetCode_BFS_DFS_easy.no1971;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        queue.add(source);
        set.add(source);

        while (!queue.isEmpty()){
            int currentNode = queue.poll();

            if (currentNode == destination){
                return true;
            }

            for (int i = 0; i < edges.length; i++) {
                // 0열에서 1열로 연결되는 상황
                if(edges[i][0] == currentNode && !set.contains(edges[i][1])){
                    set.add(edges[i][0]);
                    queue.add(edges[i][0]);
                    if(destination == edges[i][1]){
                        return true;
                    }
                }
                // 1열에서 0열로 연결되는 상황
                else if (edges[i][1] == currentNode && !set.contains(edges[i][0])){
                    set.add(edges[i][1]);
                    queue.add(edges[i][1]);
                    if (destination == edges[i][0]){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}