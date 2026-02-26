class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = n*(n+1)/2;
        int sum =0;
        for(int num: nums){
            sum +=num;
        }
        return totalsum-sum;





























































        //using treeset t.c 0(N) , sc 0(N), 
        
        // int n = nums.length;
        // TreeSet <Integer> keyset = new TreeSet<>();
       
        // for(int i = 0; i< nums.length; i++){
        //     keyset.add(nums[i]);
        // }
        
        // for(int i =0; i<=n ; i++){
        //     if(! keyset.contains(i) ){
        //         return i;
        //     }
            
        // }
        // return -1;


        //i need to optimise and make it sc 0(1) & tc 0(N)
//******************************************************************************** */
        // int n = nums.length;
        // int sumcalculated =0;
        // for(int num: nums){
        //     sumcalculated += num;
        // }

        // int totalsum = n*(n+1)/2;

        // return (totalsum-sumcalculated);
        
    }
}