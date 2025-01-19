import java.util.PriorityQueue;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }
        
        int m = heightMap.length, n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // Min-heap
        
        // Add all boundary cells to the heap
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    heap.offer(new int[] {heightMap[i][j], i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        int trappedWater = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Process the heap
        while (!heap.isEmpty()) {
            int[] cell = heap.poll();
            int height = cell[0], x = cell[1], y = cell[2];
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    trappedWater += Math.max(0, height - heightMap[nx][ny]);
                    heap.offer(new int[] {Math.max(height, heightMap[nx][ny]), nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        
        return trappedWater;
    }
}