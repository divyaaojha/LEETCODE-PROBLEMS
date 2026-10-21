class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length==1){
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        
        //freq of all elements stored in it
        for(int num: nums){
            map.put( num, map.getOrDefault(num, 0)+1 );
        }

        List<Integer> sortedList = new ArrayList<>(map.keySet()); //entered all keys in this and sorted them on the basis of their values/freqs

        sortedList.sort((a,b) -> map.get(b)-map.get(a));

        int[]ans = new int[k];
        
        for(int i =0; i<k ; i++){
            ans[i]= sortedList.get(i);
        }

        return ans;
        
       
    }     
}