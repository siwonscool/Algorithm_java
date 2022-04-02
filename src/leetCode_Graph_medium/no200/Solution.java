package leetCode_Graph_medium.no200;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    Queue<String> queue = new LinkedList<>();
    Set<String>  set = new HashSet<>();
    char[][] globalGrid = null;
    int island = 0;
    int rows = 0;
    int columns = 0;

    public int numIslands(char[][] grid) {
        globalGrid = grid;
        rows = grid.length;
        columns = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(!set.contains(i + ":" + j) && grid[i][j]=='1'){
                    bfs(i,j);
                    island++;
                }
            }
        }

        return island;
    }

    public void bfs(int row, int column) {
        if (set.contains(row + ":" + column) || row >= rows || column >= columns || row < 0 || column < 0) {
            return;
        }

        if (globalGrid[row][column] == '0') {
            return;
        }

        set.add(row + ":" + column);

        queue.add((row + 1) + ":" + (column));
        queue.add((row - 1) + ":" + (column));
        queue.add((row) + ":" + (column + 1));
        queue.add((row) + ":" + (column -1));

        while (!queue.isEmpty()){
            String islandField[] = queue.poll().split(":");
            int r = Integer.valueOf(islandField[0]);
            int c = Integer.valueOf(islandField[1]);

            bfs(r,c);
        }
    }
}
