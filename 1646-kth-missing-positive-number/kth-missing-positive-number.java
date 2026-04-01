class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int l =0; int r =arr.length-1;
        while (l<=r) {
            int mid = l+ (r-l)/2;

            int diff = arr[mid] - (mid+1);// no of missing ele at this index
            if(diff < k){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
            
        } 
        return k + r +1;
    }
}