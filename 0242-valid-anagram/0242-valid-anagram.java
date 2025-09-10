class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for( char i : t.toCharArray()){
            if(!mp.containsKey(i) || mp.get(i)==0){
                return false;
            }
         mp.put(i,mp.get(i)-1);
        }
        return true;
    }
}