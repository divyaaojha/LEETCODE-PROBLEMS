class Solution {
    public void swap(int []nums, int a, int b){
        int temp =nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }
    public void reverse(int []nums, int l, int r){
        while(l<r){
         swap(nums, l++, r--);

        }
    }
    public void nextPermutation(int[] nums) {

        // finding next nextPermutation means finding the next increasing smallest change, which is next in lexograohically just next, 
        //This we make sure in 2 steps, 
        //step 1: FIND THE PIVOT(first element from right, smaller than its next or just rightward element)
        //step 2: after pivot to last n-1, is definitely strictly decreasing element,so the first element we come across which is greate rthan pivot from the smallest from among the greater suffix, and swap them
        //step 3: now reverse the suffix, 
        //the result is the next nextPermutation which is lexographically increasing next


        int n = nums.length;
        //pivot, we will start comparing from n-1 th ele
        int i=n-2;
        //step 1
        while( i>=0 && nums[i] >= nums[i+1]){
            //if no element greater than i;  i =-1. which menas just reverse, as the order which we have is the larget, so we need to go to the first order.
            i--;
        }

        //step 2 
        // i.e ( i != -1 ), we got an element greater than pivot right next to it
        
        if( i>=0 ){
            int j =n-1;
            while(nums[j] <= nums[i]){
                j--;
            }

            swap(nums, i, j);
        }

        //step 3 , reverse from pivot+1 to n-1
        reverse(nums, i+1, n-1);

       
        
    }
}