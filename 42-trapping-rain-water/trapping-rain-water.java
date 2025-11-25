class Solution {
    public int trap(int[] height) {
        int n =height.length;
        int water=0;
        int[] rmax= new int[n];
        rmax[n-1]=height[n-1];
        int leftmax = height[0];

        //constructing rmax array
        for(int i = n-2; i >=0; i--){
            rmax[i] = Math.max(height[i] , rmax[i+1]);
        }

        for(int i=0; i<n; i++){
            leftmax =Math.max(height[i], leftmax);
            int minbound = Math.min(leftmax, rmax[i]);
            //when currentheight is les than this minbound, then only water can be trapped
            if(height[i] < minbound){
                water+= minbound - height[i];
            }
        }

       return water;
    }
}