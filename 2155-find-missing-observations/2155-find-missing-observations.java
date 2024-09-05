class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int need= (m+n)*mean;

        int previous=0;
        for(int i=0;i<m;i++){
            previous +=rolls[i];
        }
        int missing=need-previous;

        if(missing<n || missing>6*n){
            return new int[0];

        }
        int[] missings=new int[n];
        int base= missing/n;
        int extra=missing%n;

        for(int i=0;i<n;i++){
            missings[i]=base;
        }
         for(int i=0;i<extra;i++){
            missings[i]++;
        }
        return missings;
    }
}