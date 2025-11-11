class Solution {
    public int findNumbers(int[] nums) {

    //method 1: counting number of digits

    //   int count=0;
    //  for(int i =0; i<nums.length; i++){
    //     int num = nums[i];
    //     int ans =0;
    //     while(num!=0){
    //         num = num/10;
    //         ans++;
    //     }
    //     if(ans%2==0){
    //         count++;
    //     }
    //  }
    //  return count;



    //method 2: converting to string and taking its length
    int count=0;
    for(int num : nums){
        String str = String.valueOf(num);
        if(str.length() %2 == 0){
            count++;
        }
    }

    return count;
    }
}