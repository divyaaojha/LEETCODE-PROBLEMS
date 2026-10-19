
import java.util.HexFormat;class Solution {
    public int maxArea(int[] height) {
        // int n = height.length;

        // int maxwater=0;

        // for(int i =0; i<n-1; i++){
        //     int a = height[i];
        //     for(int j =i+1; j<n; j++){
        //         int b = Math.min(height[j], a);
        //         maxwater= Math.max(maxwater, b*(j-i));
        //     }
        // }
        // return maxwater;


        int n = height.length;

        int maxwater=0;
        int i =0; int j = n-1;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            int w = j-i;
            maxwater = Math.max(maxwater, h*w);

            if(height[i]< height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return maxwater;
    }

}