class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[][] prefix = new int[words.length][2];
        int prev = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<words.length;i++){
            int flag = vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1)) ? 1:0;
            prefix[i][0]= flag+prev;
            prefix[i][1]= flag;
            prev += flag;
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i] = prefix[queries[i][1]][0]-prefix[queries[i][0]][0]+prefix[queries[i][0]][1];
        }
        return res;
    }
}