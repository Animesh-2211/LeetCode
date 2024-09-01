class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int n1=original.length;
        if(n1 != m*n){
            return  new int[0][0];
        }
        int[][] modified= new int[m][n];

        for(int i=0;i<n1;i++){
             
             int row=i/n;
             int col=i%n;
             modified[row][col]=original[i];
        }
        return modified;
    }
}