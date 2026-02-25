class Solution {
    public int missingNumber(int[] nums) {

        //using treeset
        int n = nums.length;
        TreeSet <Integer> keyset = new TreeSet<>();
       
        for(int i = 0; i< nums.length; i++){
            keyset.add(nums[i]);
        }
        
        for(int i =0; i<=n ; i++){
            if(! keyset.contains(i) ){
                return i;
            }
            
        }
        return -1;
        
    }
}