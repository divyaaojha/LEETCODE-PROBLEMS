class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0; int j =height.length-1;
        int maxhleft=0; 
        int maxhright=0; int maxarea=0;
        while(i<j){
            
            int minh= Math.min(height[i], height[j]);
            int width= j-i;
            int area = width * minh;
            maxarea= Math.max(maxarea, area);
              if(height[i]<height[j]){
                //moving shorter line
                i++;
            }
            else{
                j--;
            }

        }
        return maxarea;

        //height me min lena hai, 
    }
}