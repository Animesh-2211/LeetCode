class Solution {
    public boolean wordPattern(String pattern, String s) {
         
        String words[]=s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character,String>  mp=new HashMap<>();
        HashMap<String,Character> rev =new HashMap<>();
        
       
             
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                if(rev.containsKey(word)){
                    return false;
                }
                mp.put(ch,word);
                rev.put(word,ch);
            }

        }
        return true;
    }
}