 class Solution {
    public void rotate(int[] nums, int k) {
    
        int n =nums.length;

        k = k % n;  // important
    
      
        int[]temp = new int[n];
    

    int m =0;

        for(int j =n-k; j<n; j++){
            temp[m++]= nums[j];
            
        }

        for(int l= 0; l<n-k; l++){
             temp[m++]= nums[l];
        }
        for(int g =0; g<n; g++){
            nums[g]=temp[g];
        }
        //wrong- index out of bound

    }
}