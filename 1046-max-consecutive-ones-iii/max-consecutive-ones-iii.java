class Solution {
    public int longestOnes(int[] nums, int k) {
      int n = nums.length;
        int maxcount=0;
      for(int i =0; i< n ; i++){
        int zeros=0;

        for(int j =i; j<n; j++){
            if(nums[j]==0){
                zeros++;
            }
            if(zeros>k){
                break;
            }
            maxcount= Math.max(maxcount, j-i+1);
        }
      } 
      return maxcount; 
    }
}


/*
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        
        int maxcount =0;
       
        for(int i =0; i< n ; i++){
            int m =0;
             int count=0;
            if(nums[i] ==0 && m < k ){
                m++;
                count++;
                
            }
            if(nums[i]==1){
                count++;
            }

            for(int j =i+1; j<n; j++ ){
                if(m<k){
                    if(nums[j]==0){
                        m++;
                        count++;
                        
                    }
                    else{
                        count++;
                    }
                }
                else if(nums[j] ==0){
                   
                    break;
                }
                else{
                    count++;
                }
                
                   
            

            }
            maxcount= Math.max(maxcount, count);
        }
        return maxcount;
    }
}

*/