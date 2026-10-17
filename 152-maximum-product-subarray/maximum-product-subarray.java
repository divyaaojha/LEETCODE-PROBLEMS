class Solution {
    public int maxProduct(int[] nums) {
       int maxProduct=nums[0];
       for(int i =0; i<nums.length; i++){
        int currprod= 1;
        for(int j =i; j<nums.length; j++){
            currprod *= nums[j];
            maxProduct =Math.max(maxProduct, currprod);
        }
       } 
       return maxProduct;

    
    }
}