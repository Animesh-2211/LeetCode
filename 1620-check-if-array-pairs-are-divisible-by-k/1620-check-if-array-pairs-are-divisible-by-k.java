class Solution {
    public boolean canArrange(int[] arr, int k) {
            final int[] countLeftOvers = new int[k];
        for(final int a : arr) {
            countLeftOvers[((a % k) + k) % k]++;
        }
        if(countLeftOvers[0] % 2 != 0) {
            return false;
        }
        if(k % 2 == 0 && countLeftOvers[k / 2] % 2 != 0) {
            return false;
        }
        final int limit = k % 2 == 0 ? k / 2 : (k + 1) / 2;
        for(int i=1; i < limit; i++) {
            if (countLeftOvers[i] != countLeftOvers[k - i]) {
                return false;
            }
        }
        return true;
    }
}