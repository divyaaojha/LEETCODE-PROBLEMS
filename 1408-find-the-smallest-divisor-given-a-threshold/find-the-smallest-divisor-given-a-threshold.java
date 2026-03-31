class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int min = nums[0];
        int max = nums[0];

        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int l = 1; int r = max;

        while(l<=r){
            int mid = l+ (r-l)/2;
            int sum =0;
            for(int i =0; i<n ; i++){
                sum += (nums[i] + mid -1)/mid;
                if(sum >threshold){
                    break;
                }
            }

            if(sum <= threshold){
                r=mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return l;
    }
}