
import java.util.Map.Entry;class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> m= new HashMap<>();
        int n = nums.length;
        for(int i =0; i<n ; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        } 
        for(Entry<Integer, Integer> entry: m.entrySet()){

            if(entry.getValue()== 1){
                int num= entry.getKey();
                return num;
            }
        }
        return -1;
    }
}