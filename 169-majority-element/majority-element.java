class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> m= new HashMap<>();
        int majority=0; int maxi=0;
        for(int num: nums){
            m.put(num, m.getOrDefault(num,0)+1);
        }

        for(int key :m.keySet()){
            if(m.get(key) > maxi){
                maxi = m.get(key);
                majority = key;
            }
        }
        return majority;


        //TLE********** BUT WORKS
        // Arrays.sort(nums);
        // int major=0;
        // int n = nums.length;
        // int count=1; int maxcount=0;int index =0;
        // for(int i =1; i<n; i++){

        //     for(int j =i+1; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //             if(maxcount<count){
        //                 maxcount= count;
        //                 index =j;
        //             }
        //         }
        //     }
        //     count=1;
            
        // }
        // return nums[index];
    }
}