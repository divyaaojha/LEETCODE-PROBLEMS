class Solution {
    public int removeElement(int[] nums, int val) {
        int count=nums.length;
        int []temp = new int[nums.length]; int ind=0;
        for(int num:nums){
            if(num==val)count--;
          else{
            temp[ind++]=num;
          }
            
        }

        for(int i =0; i<temp.length; i++){
            nums[i]=temp[i];
        }
        
        return count;
    }
}