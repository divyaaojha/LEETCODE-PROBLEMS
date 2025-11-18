class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
             map.put(num, map.getOrDefault(num,0)+1);
        }
        int majority=0;
        int maxi =0;

        for(int key : map.keySet()){
            if(map.get(key) > maxi){
                maxi = map.get(key);
                majority = key;
            }
        }
return majority;
    }
}