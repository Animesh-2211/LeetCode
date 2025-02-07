class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] res = new int[queries.length];
        int k = 0;
        Map<Integer,Integer> ballColor = new HashMap<>();
        Map<Integer,Integer> colorCount = new HashMap<>();

        for(int[] q:queries)
        {
        int ball = q[0];
        int color = q[1];
        Integer prevColor = ballColor.get(ball);
        if(prevColor != null)
        {
         int prevCount = colorCount.get(prevColor);   
         if(prevCount==1)
         colorCount.remove(prevColor);
         else   
         colorCount.put(prevColor,prevCount-1);  
        }
        ballColor.put(ball,color);
        colorCount.put(color,colorCount.getOrDefault(color,0)+1); 
        res[k++]=colorCount.size();
        }
        return res;
    }
}