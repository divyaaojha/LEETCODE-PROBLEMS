class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int count=0;
       int i =0; int j =0;
       while(j<n){
        if(nums[i]==nums[j]){
            j++;
            count++;
            if(count> (n/3) && !ans.contains(nums[i]) ){
                    ans.add(nums[i]);
                }
        }
        if( j <n && nums[i] != nums[j]){
            i =j;
            count=0;
        }
       }

return ans;

        /************************************************************************************************************** */
        // int n = nums.length;
        // HashMap<Integer, Integer> freqmap = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();

        // for(int i =0; i<n; i++){
        //     freqmap.put(nums[i], freqmap.getOrDefault(nums[i], 0)+1);
        //     if(freqmap.get(nums[i]) > (n/3) && !ans.contains(nums[i])){
        //         ans.add(nums[i]);
        //     }
        // }
        // return ans;
        //**************************************************************************************** */
        // //brute force, tc= n^2, sc = 0(1)
        // int n = nums.length;
        // int count=0;
        // List<Integer> ans = new ArrayList<>();
        // for(int i =0; i<n; i++){
        //     for(int j =i; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             count++;    
        //          }
        //         }

        //         if(count> (n/3) && !ans.contains(nums[i]) ){
        //             ans.add(nums[i]);
        //         }
        //         count=0;
        //     }
        // return ans;
    }
}