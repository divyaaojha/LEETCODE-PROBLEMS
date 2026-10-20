class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int leftmax=height[0];
        int rightmax=height[n-1];

        int water=0;
        int i =0; int j =n-1;
        while(i<j){

        //we process the side whose boundary is smaller    
            if(leftmax <= rightmax){
                i++;
                leftmax= Math.max(leftmax, height[i]);
                water += leftmax - height[i];
            }
            else{
                j--;
                rightmax= Math.max(rightmax, height[j]);
                water += rightmax- height[j];
            }

        }

        return water;


        // int n = height.length;

        // if (n <3) {
        //     return 0;
        // }

        // int[] prefix= new int[n];
        // int[] suffix= new int[n];

        // int leftmax=height[0];
        // int rightmax=height[n-1];

        // prefix[0]=0;
        // for(int i =1; i<n; i++){
        //     leftmax= Math.max(leftmax, height[i]);
        //     prefix[i]= leftmax;
        // }

        // for(int j =n-2; j>=0; j-- ){
        //     rightmax =Math.max(rightmax, height[j]);
        //     suffix[j]= rightmax;
        // }
        // suffix[n-1]=0;

        // int water=0;
        // for(int i =0; i<n; i++){
        //     water += Math.max(0, Math.min(prefix[i],suffix[i])-height[i]);
        // }
        // return water;
    }
}