class Solution {
    
    public String shiftingLetters(String s, int[][] shifts) {
        int[] diff = new int[s.length()+1];
        
        for(int[] shift:shifts)
        {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            if(direction == 0)
            {
                direction =-1;
            }
            diff[start]+=direction;
            if(end+1 < s.length())
            {

            
              diff[end+1]-=direction;
            }
        }
        int currentShift = 0;
        for(int i=0;i<s.length();i++)
        {
            currentShift+=diff[i];
            diff[i] = currentShift;
        }
        StringBuilder result = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            int netShift =(diff[i]%26 +26)%26;
            result.setCharAt(i,(char)('a'+(s.charAt(i)-'a'+netShift)%26));
        }
        return result.toString();
        
    }
}