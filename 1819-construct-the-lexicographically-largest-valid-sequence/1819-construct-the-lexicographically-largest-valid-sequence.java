class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        Arrays.fill(res, 0);
        Arrays.fill(used, false);
        backtrack(res, used, 0, n);
        return res;
    }
    private boolean backtrack(int[] res, boolean[] used, int pos, int n) {
        if(pos == 2 * n - 1) return true;
        if(res[pos] != 0) return backtrack(res, used, pos + 1, n);
        for (int i = n; i >= 1; --i) {
            if (used[i]) continue;
            used[i] = true;
            res[pos] = i;
            if(i == 1 && backtrack(res, used, pos + 1, n)) return true;
            if(i > 1 && (pos + i) < (2 * n - 1) && res[pos + i] == 0) {
                res[pos + i] = i;
                if(backtrack(res, used, pos + 1, n)) return true;
                res[pos + i] = 0;
            }
            used[i] = false;
            res[pos] = 0;
        }
        return false;
    }
}