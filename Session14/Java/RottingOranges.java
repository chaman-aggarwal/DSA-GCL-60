https://leetcode.com/problems/rotting-oranges/

class Solution {

    private static class Node {
        int row;
        int col;
        int time;

        public Node(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        Queue<Node> queue = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new Node(i, j, 0));
                }
                else if(grid[i][j] == 1) {
                    fresh++;
                } 
            }
        }
        
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int time = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            time = node.time;
            for (int[] dir : dirs) {
                int row = node.row + dir[0];
                int col = node.col + dir[1];
                if (row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == 1) {
                    grid[row][col] = 2;
                    fresh--;
                    queue.offer(new Node(row, col, time + 1));
                }
            }
        }
        return fresh == 0 ? time : -1;
    }
}