class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
         int count=0;
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
         
           
            for(int j =i; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;    
                 }

                }
                if(count> (n/3) && !ans.contains(nums[i]) ){
                    ans.add(nums[i]);
                }
                count=0;

            }
            
        
        return ans;
    }
}