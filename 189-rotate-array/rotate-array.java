class Solution {
    void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a]= arr[b];
            arr[b]= temp;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
       // rotate to right by k steps, without extra space
       //reverse whole array
       // reverse first k then
       // reverse last n-k then

       int n = nums.length;
       k = k%n;
       reverse(nums, 0, n-1);
       reverse(nums, 0, k-1);
       reverse(nums, k, n-1);

    }
}