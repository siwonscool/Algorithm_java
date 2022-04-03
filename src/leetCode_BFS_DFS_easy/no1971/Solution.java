package leetCode_BFS_DFS_easy.no1971;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    //그래프 문제를 풀때는 그래프 하나를 만들어놓고 반복문 도는게 좋다. input 을 전부 돌필요는 없음!
    //O(ne)
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
                    set.add(edges[i][1]);
                    queue.add(edges[i][1]);
                    if(destination == edges[i][1]){
                        return true;
                    }
                }
                // 1열에서 0열로 연결되는 상황
                else if (edges[i][1] == currentNode && !set.contains(edges[i][0])){
                    set.add(edges[i][0]);
                    queue.add(edges[i][0]);
                    if (destination == edges[i][0]){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    //disjoint set union
    //n = 5
    //int[] parent = {0,1,2,3,4}
    //모든 node 들이 하나의 연결된 그룹안에 있느냐를 판단해서 source destination 을 판단
}