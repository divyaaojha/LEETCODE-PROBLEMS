class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] temp = new int[n];
        for(int i =0; i<n; i++){
            //move every step ahead by k
            temp[(i+k) %n] = nums[i];

        }
        for(int i =0; i<n; i++){
            //move every step ahead by k
            nums[i]= temp[i];

        }


    }
}