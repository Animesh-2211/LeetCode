class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int freq1[] = new int[256];
         int freq2[] = new int[256];

        for(int i=0;i<s.length() || i<t.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}