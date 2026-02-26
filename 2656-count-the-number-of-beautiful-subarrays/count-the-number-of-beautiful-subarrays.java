class Solution {
    public long beautifulSubarrays(int[] nums) {
        // this is basically: count subbarray with XOR =0;
     
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        long count =0;
        int prefixxor= 0; // // a ^ 0 = a ;

        for(int num:nums){
            prefixxor ^= num;
            
            //we can simply write prefixxor instead of prefixxor ^0, cuz they are same, its written for clarity
            if(map.containsKey(prefixxor^0)){
                count += map.get(prefixxor ^0);
            }

            map.put(prefixxor, map.getOrDefault(prefixxor, 0)+1);
        }

        return count;
    }
}