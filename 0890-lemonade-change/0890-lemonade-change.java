class Solution {
    public boolean lemonadeChange(int[] bills) {
         int n=bills.length;
        int five=0;
        int ten=0;
        int twenty=0;
         int i=0;
        for(i=0;i<n;i++){
            if(bills[i]==5){
                five++;

            }
            else if(bills[i]==10){
                if(five <1){
                    return false;
                }
                else{
                    ten++;
                    five--;
                }
            }
            else if(bills[i]==20){
                 if(five >=1 && ten>=1){
                    twenty++;
                    five--;
                    ten--;
                }
               else if(five>=3){
                   twenty++;
                   five -=3;
                }
                
               
                else{
                    return false;
                }
                
               
            }
            
        }
       
         return true;
          
         
        
    }
}