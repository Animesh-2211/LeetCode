class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> mp=new  HashMap<>();
        int n=heights.length;
        for(int i=0;i<heights.length;i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String s[]=new String[n];
        int j=0;
        for( int i=n-1;i>=0;i--){
            s[j++]=mp.get(heights[i]);
        }

        return s;

        
    }
}