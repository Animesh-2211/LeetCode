class Solution {
    static final int dirs[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean vis[][] = new boolean[m][n];
        for(int i=0; i<m; ++i) {
            for(int j=0; j<n; ++j) {
                if(isWater[i][j] == 1) {
                    q.add(new int[]{i, j});
                    vis[i][j] = true;
                    isWater[i][j] = 0;
                }
            }
        }

        int curr[];
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-- > 0) {
                curr = q.remove();
                int i = curr[0], j = curr[1];

                for(int d[] : dirs) {
                    int x = curr[0] + d[0];
                    int y = curr[1] + d[1];

                    if(x < 0 || y < 0 || x >= m || y >= n || vis[x][y]) {
                        continue;
                    }

                    isWater[x][y] = isWater[i][j] + 1;
                    vis[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }
        }

        return isWater;
    }
}