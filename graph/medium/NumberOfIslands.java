package graph.medium;

// Number of Islands
// Given an n × m grid[][] consisting of 'L' (land) and 'W' (water), we need to count the total number of islands present in the grid without modifying the original grid.
// An island is defined as a group of connected 'L' cells that are adjacent horizontally, vertically, or diagonally, and surrounded by water or the boundary of the grid.
//
//         Examples:
//
// Input: grid[][] = [['L', 'L', 'W', 'W', 'W'],
//                    ['W', 'L', 'W', 'W', 'L'],
//                    ['L', 'W', 'W', 'L', 'L'],
//                    ['W', 'W', 'W', 'W', 'W'],
//                    ['L', 'W', 'L', 'L', 'W']]
// Output: 4
// Explanation: The image below shows all the 4 islands.
//
// Input: grid[][] = [['W', 'L', 'L', 'L', 'W', 'W', 'W'],
//                    ['W', 'W', 'L', 'L', 'W', 'L', 'W']]
// Output: 2
// Explanation: The image below shows all the 2 islands in the graph

public class NumberOfIslands {

    public static int findNumberOfIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    // (-1,-1)      (-1,0)      (-1,1)
    // (0,-1)       cell        (0,1)
    // (1,-1)       (1,0)       (1,1)
    static int[] dx = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
    static int[] dy = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};

    public static void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 8; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (isValid(grid, visited, nx, ny)) {
                dfs(grid, visited, nx, ny);
            }
        }
    }

    private static boolean isValid(int[][] grid, boolean[][] visited, int x, int y) {
        return x >= 0 && y >= 0 &&
                x < grid.length && y < grid[0].length &&
                grid[x][y] == 'L' && !visited[x][y];
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {'L', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'W', 'W', 'L', 'L'},
                {'W', 'W', 'W', 'W', 'W'},
                {'L', 'W', 'L', 'L', 'W'}
        };
        System.out.println(findNumberOfIslands(grid1)); // Output: 4

        int[][] grid2 = {
                {'W', 'L', 'L', 'L', 'W', 'W', 'W'},
                {'W', 'W', 'L', 'L', 'W', 'L', 'W'}
        };
        System.out.println(findNumberOfIslands(grid2)); // Output: 2
    }
}
