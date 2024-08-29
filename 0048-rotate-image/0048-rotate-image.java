class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){

                int temp=mat[n-1-j][i];

                mat[n-1-j][i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=mat[i][j];
                mat[i][j]=temp;
            }
        }
    }
}