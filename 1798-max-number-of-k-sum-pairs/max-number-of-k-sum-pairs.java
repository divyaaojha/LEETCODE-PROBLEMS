class Solution {
    public int maxOperations(int[] nums, int k) {

     
       int count=0;
       Map<Integer, Integer> map = new HashMap<>();
       for(int num:nums ){
        if(map.getOrDefault(k-num, 0)>0){
              count++;
            map.put(k-num, map.get(k-num)-1);
          
        }
        else{
            map.put(num, map.getOrDefault(num, 0)+1);

        }
       }
      
      return count;
    }
}


/*
        int n = nums.length;
        int count=0;
        for(int i =0; i<n-1; i++){
            int a= nums[i];
            if(nums[i] ==-1){
                continue;
            }
            for(int j=i+1; j<n; j++){
                int b = nums[j];
               if(nums[i]== -1 || nums[j]==-1){
                continue;
               }
                    if(a+b == k){
                    nums[i]=-1;
                    nums[j]=-1;
                    count++;
                    break;
                }
                
                
            }
        }
        return count;



*/



