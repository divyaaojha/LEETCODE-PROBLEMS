class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length -1 ;
        return mergeSort(nums, 0, n);
        
    }

    private int mergeSort(int[]nums, int start, int end){
        if(start >= end){
            return 0;
        }
        int mid = start + (end-start)/2 ;
        int count =0;
        count += mergeSort(nums, start, mid);
        count+= mergeSort(nums, mid+1, end);
        count += countPairs(nums, start, mid, end);

        merge(nums, start, mid, end);

        return count;
    }

    private int countPairs(int[] nums, int start, int mid, int end){
        int left = start;
        int right = mid+1;
        int count=0;
        for(int i = left; i<= mid; i++){

            while(right<=end && nums[i] > 2L * nums[right]){
                right++;
            }
             count += right - (mid+1);
        }
       
        return count;

    }

    private void merge(int[]nums, int start, int mid, int end){
        int[] temp = new int[end-start +1];
        int k =0;
        int i = start;
        int j = mid+1;
        while(i<=mid && j <= end){
            if(nums[i]<= nums[j]){
                temp[k++]= nums[i];
                i++;
            }
            else{
                temp[k++]= nums[j];
                j++;
            }
        }

        while(i<= mid){
            temp[k++]= nums[i];
                i++;
        }
        while(j <= end){
             temp[k++]= nums[j];
                j++;
        }

        for(int m =0; m<temp.length; m++){
            nums[start + m]= temp[m];
        }
    }




    //     //Time Limit Exceeded - 33 / 140 testcases passed
    //    int n =nums.length;
    //     int count=0;
    //    for(int i =0; i<n-1; i++){
    //     for(int j=i+1; j<n; j++){
    //         if(nums[i] > 2L * nums[j]){
    //             count++;
    //         }
    //     }
    //    }
    //    return count;
    
}