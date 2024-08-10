class Solution {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        
        //  Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        // Initialize the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        // Merge intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            // Check if there is an overlap
            if (currentInterval[1] >= nextInterval[0]) {
                // There is an overlap, so merge the intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // No overlap, add the current interval to the list
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }
        
        // Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
    
   
}
 
    