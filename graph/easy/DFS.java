package graph.easy;

// DFS Traversal of Undirected Graph
// Problem Statement: Given an undirected graph with N nodes (0 to N-1) and edges list, perform Depth First Search (DFS) traversal starting from node 0.
//                    Return the DFS traversal order as a list.
// Input Format: N → number of nodes, edges[][] → list of edges Graph is connected
//
// Input: N = 5
//        edges = [
//                   [0,1],
//                   [0,2],
//                   [1,3],
//                   [2,4]
//                ]
// Graph Structure:
//               0
//              / \
//             1   2
//            /     \
//           3       4
//
// Output: [0, 1, 3, 2, 4]
//
// Explanation:
// Start from 0 → go to 1 → go to 3 → backtrack → go to 2 → go to 4


// Input: N = 4
//        edges = [
//                 [0,1],
//                 [1,2],
//                 [2,3]
//                ]
//
// Graph Structure:
// 0 — 1 — 2 — 3
//
// Output: [0, 1, 2, 3]
//
// Explanation:
// Start from 0 → 1 → 2 → 3 (no backtracking needed)

import java.util.ArrayList;
import java.util.List;

public class DFS {


    private static List<Integer> traverse(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> adjacencyList = getAdjacencyList(n, edges);
        boolean[] visited = new boolean[n];

        dfs(0, adjacencyList, visited, res);

        return res;
    }

    private static void dfs(int node, List<List<Integer>> adjacencyList, boolean[] visited, List<Integer> res) {
        visited[node] = true;
        res.add(node);

        for (Integer neighbour : adjacencyList.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adjacencyList, visited, res);
            }
        }
    }

    private static List<List<Integer>> getAdjacencyList(int n, int[][] edges) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int fromNode = edge[0];
            int toNode = edge[1];

            adjacencyList.get(fromNode).add(toNode);
            adjacencyList.get(toNode).add(fromNode);
        }
        return adjacencyList;
    }

    public static void main(String[] args) {
        int N1 = 5;
        int[][] edges1 = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4}
        };
        System.out.println(traverse(N1, edges1)); // Output: [0, 1, 3, 2, 4]

        int N2 = 4;
        int[][] edges2 = {
                {0, 1},
                {1, 2},
                {2, 3}
        };
        System.out.println(traverse(N2, edges2)); // Output: [0, 1, 2, 3]

    }
}
