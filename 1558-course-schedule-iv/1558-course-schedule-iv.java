import java.util.*;

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        ArrayList<Boolean> result = new ArrayList<>();
        for (int[] query : queries) {
            boolean[] visited = new boolean[numCourses];
            result.add(dfs(graph, query[0], query[1], visited));
        }
        return result;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int neighbor : graph.get(src)) {
            if (!visited[neighbor] ) {
                if(dfs(graph, neighbor, dest, visited))
                return true;
            }
        }
        return false;
    }
}