class Solution {
    public int help(HashMap<Integer, Integer> pp, int[][] grid, int i, int j, int m, int n, int maper) {

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = maper;

        int up = help(pp, grid, i - 1, j, m, n, maper);
        int down = help(pp, grid, i + 1, j, m, n, maper);
        int left = help(pp, grid, i, j - 1, m, n, maper);
        int right = help(pp, grid, i, j + 1, m, n, maper);

        return up + down + left + right + 1;

    }

    public int largestIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int count = 0;
        HashMap<Integer, Integer> pp = new HashMap<>();

        int maper = 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maper++;
                    int val = help(pp, grid, i, j, m, n, maper);
                    // System.out.println("map"+ maper+"val " +val);
                    pp.put(maper, val);
                    ans = Math.max(ans, val);

                }
            }
        }


        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 0){
                    int counter = 1;
                    HashSet<Integer> ppp = new HashSet<>();
                    //up
                    if(i > 0 && !ppp.contains(grid[i-1][j]) && grid[i-1][j] != 0){
                        counter += pp.get(grid[i-1][j]);
                        ppp.add(grid[i-1][j]);
                    }
                    // down
                    if(i < m-1 && !ppp.contains(grid[i+1][j]) && grid[i+1][j] != 0){
                        counter += pp.get(grid[i+1][j]);
                        ppp.add(grid[i+1][j]);
                    }
                    //left
                    if( j > 0 && !ppp.contains(grid[i][j-1]) && grid[i][j-1] != 0){
                        counter += pp.get(grid[i][j-1]);
                        ppp.add(grid[i][j-1]);
                    }
                    //right
                    if(j < n-1 && !ppp.contains(grid[i][j+1]) && grid[i][j+1] != 0){
                        counter += pp.get(grid[i][j+1]);
                        ppp.add(grid[i][j+1]);
                    }

                    ans = Math.max(ans, counter);
                }
            }
        }
       
        return ans;
    }

}