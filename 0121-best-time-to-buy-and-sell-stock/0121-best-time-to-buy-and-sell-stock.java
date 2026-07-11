class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null ){
            return 0;
        }

        int max =0;
        int min = prices[0];

        for(int i=1;i<prices.length;i++){
            if(min> prices[i])
            {
                min = prices[i];
            }
            else if(prices[i]-min > max){
                max = prices[i] - min;
            } 
        }
          return max;
    }
}