class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //optimal solution using bucket whose index is basically frequency of the elements inside it
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
        map.put( num, map.getOrDefault(num, 0)+1 );
        }

        List<List<Integer>> bucketlist= new ArrayList<>();

        //create n+1 buckets
        for(int i=0; i<=nums.length; i++){
            bucketlist.add(new ArrayList<>());
        }

        for(int key: map.keySet()){
            int count = map.get(key);
            bucketlist.get(count).add(key);
        }

        int[]ans = new int[k]; int index =0;
        for(int i =nums.length ; i>=1; i--){
            for(int ele :bucketlist.get(i)){
                ans[index++]= ele;

                if(index>=k){
                    return ans;
                }
            }
        }

        return ans;



        /************************************************** */
        // if (nums.length==1){
        //     return nums;
        // }
        // Map<Integer, Integer> map = new HashMap<>();
        
        // //freq of all elements stored in it
        // for(int num: nums){
        //     map.put( num, map.getOrDefault(num, 0)+1 );
        // }

        // List<Integer> sortedList = new ArrayList<>(map.keySet()); //entered all keys in this and sorted them on the basis of their values/freqs

        // sortedList.sort((a,b) -> map.get(b)-map.get(a));

        // int[]ans = new int[k];
        
        // for(int i =0; i<k ; i++){
        //     ans[i]= sortedList.get(i);
        // }

        // return ans;

        // //tc= n + O(u logu)= nlogn sort of, sc=O(n);
        
       
    }     
}