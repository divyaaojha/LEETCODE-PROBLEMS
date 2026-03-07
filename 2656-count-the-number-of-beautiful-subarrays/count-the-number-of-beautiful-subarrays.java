class Solution {
    public long beautifulSubarrays(int[] nums) {

        int n = nums.length;
        int prexor=0;
        long count=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        //storing prefix xor and its count in map
        map.put(0,1);

        for(int i=0; i<n; i++){
            prexor ^= nums[i];
            if(map.containsKey(prexor)){
                count+= map.get(prexor);
            }

            map.put(prexor, map.getOrDefault(prexor, 0)+1);
        }


        return count;



        // // this is basically: count subbarray with XOR =0;
     
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0,1);
        // long count =0; // it has to be long as for very large array it will exceed integer.max_value;
        // int prefixxor= 0; // // a ^ 0 = a ;

        // for(int num:nums){
        //     prefixxor ^= num;
            
        //     //we can simply write prefixxor instead of prefixxor ^0, cuz they are same, its written for clarity
        //     if(map.containsKey(prefixxor^0)){
        //         count += map.get(prefixxor ^0);
        //     }

        //     map.put(prefixxor, map.getOrDefault(prefixxor, 0)+1);
        // }

        // return count;
    }
}