class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer>  map= new HashMap<>();
        for(char c:s.toCharArray()){
            int count =map.getOrDefault(c,0);
            count++;
            map.put(c,count);
        }

        for( char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            int count=map.get(c);
            count--;
            map.put(c,count);
        }

        for(int count:map.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
