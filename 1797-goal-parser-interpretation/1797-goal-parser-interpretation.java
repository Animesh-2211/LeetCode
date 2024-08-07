class Solution {
    public String interpret(String command) {

        int n=command.length();
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<n){
            char s1=command.charAt(i);
            
            if(s1 == 'G'){
               s.append('G');
               i++;
            }
            else if(s1=='(' ){
                if(i+1<n && command.charAt(i+1)==')'){
                s.append('o');
                i= i+2;
            }
            else if(i+3<n && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')'){
        
                    s.append("al");
                    i+=4;
                }
        }
        else{
            i++;
        }
        }
        return s.toString();
    }
}