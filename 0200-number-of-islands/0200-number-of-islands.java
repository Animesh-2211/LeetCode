

class Solution {

    class Pair{
    int first , second;
    // for storing row and col
        public Pair(int first , int second){
            this.first = first; 
            this.second = second;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int isVis[][] = new int[n][m];

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(isVis[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    bfs(i,j,isVis,grid);
                }
            }
        }
        return count;
    }

    public void bfs(int row , int col , int isVis[][] , char grid[][]){
        isVis[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        int delRow[] = {1,-1,0,0};
        int delCol[] = {0,0,-1,1};


        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();

            for(int i = 0; i < 4; i++){
                int nrow = ro + delRow[i];
                int ncol = co + delCol[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
                isVis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                    isVis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
        
    }
}