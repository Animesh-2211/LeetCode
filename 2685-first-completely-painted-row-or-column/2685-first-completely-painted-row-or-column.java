class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        final int m = mat.length;
        final int n = mat[0].length;
        final int[] valToRow = new int[m * n + 1];
        final int[] valToCol = new int[m * n + 1];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                valToRow[mat[i][j]] = i;
                valToCol[mat[i][j]] = j;
            }
        }

        final int[] uncolouredInRow = new int[m];
        final int[] uncolouredInCol = new int[n];

        Arrays.fill(uncolouredInRow, n);
        Arrays.fill(uncolouredInCol, m);

        for (int i = 0; i < arr.length; ++i) {
            // Coloring arr[i];
            int r = valToRow[arr[i]];
            int c = valToCol[arr[i]];

            // Uncomment to DEBUG
            // System.out.printf("coloring %d -> %d -> %d, %d -> %d %d\n", i, arr[i], r, c, uncolouredInRow[r], uncolouredInCol[c]);

            // Color the cell[r][c]
            uncolouredInRow[r]--;
            uncolouredInCol[c]--;

            if (uncolouredInRow[r] == 0
                || uncolouredInCol[c] == 0) {
                
                return i;
            }
        }

        return -1;
    }
}