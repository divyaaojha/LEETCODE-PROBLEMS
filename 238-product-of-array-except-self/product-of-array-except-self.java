class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int [] answers= new int [n];
    int mul=1;
    int countzero=0;
    for(int i =0; i<n; i++){
        if(nums[i] != 0){
            mul *= nums[i];
        }
        else{
            countzero++;
        }
    }

    if(countzero >1){
        return answers;
    }
    for(int i =0; i<nums.length ; i++){
        if(nums[i]==0){
            
            Arrays.fill(answers, 0);
            answers[i]=mul;
            return answers;
        }
        else{
            answers[i]=  mul / nums[i];
        }

        


    }
    return answers;
        
    }
}