package graph.easy;

// BFS Traversal of Undirected Graph
// Problem Statement: Given an undirected graph with N nodes (0 to N-1) and edges list, perform Breadth First Search (BFS) traversal starting from node 0.
//                    Return the BFS traversal order as a list.
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
//Output: [0, 1, 2, 3, 4]

// Input: N = 4
//        edges = [
//                 [0,1],
//                 [1,2],
//                 [2,3]
//                ]
//
// Graph 0 — 1 — 2 — 3
// Output:[0, 1, 2, 3]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    private static List<Integer> bfs(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> adjacencyList = getAdjacencyList(n, edges);

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        // Visit starting node
        visited[0] = true;
        queue.offer(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.add(node);

            for (Integer neighbour : adjacencyList.get(node)) {
                // Visit neighbour if not already visited
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }

        return res;
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
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 3}, {2, 4}};
        System.out.println(bfs(N1, edges1)); // Output: [0, 1, 2, 3, 4]

        int N2 = 4;
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(bfs(N2, edges2)); // Output: [0, 1, 2, 3]
    }
}
