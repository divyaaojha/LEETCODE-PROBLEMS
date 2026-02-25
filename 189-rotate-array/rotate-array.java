class Solution {
       private void reverse(int[]arr, int l, int r){
        while(l<r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        l++;
        r--;
        }
        
    }
    public void rotate(int[] nums, int k) {
        //this is not in-place solution, but works
        // int n = nums.length;
        // k = k%n;
        // int[] temp = new int[n];
        // for(int i =0; i<n; i++){
        //     //move every step ahead by k
        //     temp[(i+k) %n] = nums[i];

        // }
        // for(int i =0; i<n; i++){
        //     //move every step ahead by k
        //     nums[i]= temp[i];

        // }
    
           int n = nums.length;
           k = k%n;
       
            reverse(nums, 0, n-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, n-1);

        }

    }
 


