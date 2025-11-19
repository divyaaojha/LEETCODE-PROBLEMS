class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n; // important

        int[] temp = new int[n];

        int m = 0;

        for (int j = n - k; j < n; j++) {
            temp[m++] = nums[j];

        }

        //FIRST : N-K, TO N = that means k elements copied

        for (int l = 0; l < n - k; l++) {
            temp[m++] = nums[l];
        }

        //then : 0 to n-k elements copied.
        for (int g = 0; g < n; g++) {
            nums[g] = temp[g];
        }
        //wrong- index out of bound

    }
}