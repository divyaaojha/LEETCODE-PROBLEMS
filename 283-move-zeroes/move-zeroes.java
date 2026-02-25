class Solution {
    public void moveZeroes(int[] nums) {
        //in-place Solution
        int index =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] !=0){

                //swap isnt necessary when i and index are same , we swap only when element is not zero, and index and i are different
                if(i != index){
                // swap this to the index position as that has the latest zero
                int temp = nums[index];
                nums[index]= nums[i];
                nums[i]= temp;
                
                }
                index ++;
                
            }
        }

//wont work, as they need it to be in-place
//        int count=0;
//        for(int i =0; i<nums.length; i++){
//         if(nums[i] ==0){
//             count++;
//             nums[i]= Integer.MAX_VALUE;
//         }
//        } 
//        if(count>0){
//  Arrays.sort(nums);
//        }
      

// for(int i =0; i<nums.length; i++){
//         if(nums[i] ==Integer.MAX_VALUE){
//             count++;
//             nums[i]=0 ;
//         }
//        }
    }
}