class Solution {
    public int maxArea(int[] height) {
     int n=height.length;
     int i=0;
     int j=n-1;
    
     int water=0;   

     while(i<j){

        int hei=Math.min(height[i],height[j]);
        int width=j-i;
        int retention=hei*width;
     
     water=Math.max(water,retention);
    
    if(height[i]<height[j]){
        i++;
    }
    else{
        j--;
    }
     }
    return water;
    }
}