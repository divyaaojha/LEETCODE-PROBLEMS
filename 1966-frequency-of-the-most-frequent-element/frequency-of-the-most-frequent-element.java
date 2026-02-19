class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        int sum=0;
        Arrays.sort(nums);
        
        long[] prefixsum = new long[n];
        prefixsum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }

       
    int ans=1;
    int left=0; 
    
    for(int right =0; right<n; right++){
        while(left<=right){

        
    long windowsize=right -left +1 ;
    long currsum = prefixsum[right] - (left >0 ? prefixsum[left-1]:0);
    long cost = (long)nums[right] * windowsize - currsum;

        if(cost<= k){
            // if(windowsize>ans){
            //     ans =right-left+1;
            // }
            break;  
        }

        left++;

    }
   ans = Math.max(ans, right-left+1); 
    }


return ans;


    }
}

/*  //bruteforce---- correctly done 57/73 passed
class Solution {
    public int maxFrequency(int[] nums, int k) {

        //let me calculate max possible frequencies for every element in k operations

        //bruteforce---- correctly done 57/73 passed
        //sorting array-descending
        Arrays.sort(nums); // ascending
        // reverse the array
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        int maxFreq= Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0; i<n; i++){
            int currele = nums[i];
            int freq=1;
            int op = k;

            for(int j =i+1; j<n; j++){


                if(currele == nums[j]){
                    freq++;
                    continue;
                }

                int diff = currele - nums[j]; 
                if(diff <= op && op!=0){
                    freq++;
                    op-= diff;
                }
                
                if(op<=0){
                    break;
                }
                
            }
            if(maxFreq < freq ){
                    maxFreq = freq;
                }

        }

        return maxFreq;

    }
}
*/



/*  68/73-- wrote sliding window and prefix sun solution myself
        int n = nums.length;
        int sum=0;
        Arrays.sort(nums);
        long[]prefixsum= new long[n];
        for(int i =0; i<n ; i++){
            sum+=nums[i];
            //prefixsum including current ele
            prefixsum[i]=sum;
        }

        if(n ==1){
            return 1;
        }
        int ans=1;
   int left=0; int right=1;
    
    while(left<=right && right<n){
    int windowsize=right -left +1 ;
    long currsum = prefixsum[right] - (left >0 ? prefixsum[left-1]:0);
        long cost = nums[right] * windowsize - currsum;

        if(cost<= k){
            if(windowsize>ans){
                ans = windowsize;
            }
            right++;
            
        }
        else{
            left++;
        }

    }


return ans;

*/
