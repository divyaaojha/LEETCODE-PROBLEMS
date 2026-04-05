class Solution {
    public int splitArray(int[] nums, int k) {
    int n = nums.length;
    int ans =-1;
    int sumarr =0;
    int maxarr =0;
    for(int i : nums){
        sumarr+=i;
        maxarr= Math.max(maxarr, i);
    }
    int l = maxarr;
    int r = sumarr;

    while( l<=r ){
        int mid = l+ (r-l)/2;

        int currsum=0;
        int subarr=1;
        for(int i =0; i<n; i++){
            if(currsum + nums[i] <= mid){
                currsum+= nums[i];
                
            }
            else{
                
                currsum=nums[i];
                subarr++;
            }
        }
        if(subarr <= k){ // valid so can be the ans
            r = mid-1;
            ans = mid;
        }
        else{
            l = mid +1;
        }
    }
    return ans;
    }
}