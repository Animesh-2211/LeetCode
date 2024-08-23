class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;;
        int  left=0;
        HashSet<Character> charSet=new HashSet<>();

        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);

            while(charSet.contains(current)){
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(current);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}