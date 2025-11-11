class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
     for(int i =0; i<nums.length; i++){
        int num = nums[i];
        int ans =0;
        while(num!=0){
            num = num/10;
            ans++;
        }
        if(ans%2==0){
            count++;
        }
     }
     return count;
    }
}