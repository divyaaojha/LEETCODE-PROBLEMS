class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]pre = new int [n];
        pre[0]=1;
        for(int i =1;i<n; i++ ){
            pre[i]= pre[i-1]* nums[i-1];
        }

        int[]suf = new int[n];
        suf[n-1]=1;
        for(int j = n-2; j >=0; j--){
            suf[j]= suf[j+1]* nums[j+1];
            pre[j]*=suf[j];
        }

        return pre;


    }
}











































/*
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
*/