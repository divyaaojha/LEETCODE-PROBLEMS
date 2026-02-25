class Solution {
    public int subarraySum(int[] nums, int k) {
        //optimised, hashmap + prefix sum = solution O(N)- tc, O(N)-sc
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int num: nums){
            prefix+=num;

            if(map.containsKey(prefix-k)){
                count += map.get(prefix-k) ;
            }
            map.put(prefix, map.getOrDefault(prefix,0)+1);
        }
    return count;

        //THIS WORKS BUT IS O(n2) tc:
        // // sliding window concept - wont work, as it only works for positive arrays, 
        // int count =0;
        // for(int i =0; i<nums.length; i++){
        //     int sum =0;
        //     for(int j =i; j<nums.length; j++){

        //         sum+=nums[j];

        //         if(sum == k){
        //             count++;
                    
        //         }
                
        //     }
        // }
        // return count;
    }
}