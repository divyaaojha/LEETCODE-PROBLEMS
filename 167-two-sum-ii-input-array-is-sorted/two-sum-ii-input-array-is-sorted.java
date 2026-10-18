class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        // for(int i =0; i<n-1; i++){
        //     for(int j =i+1; j<n; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[0];

        // int i =0; int j =n-1;

        // while(i<j && j<n){
        //     if(numbers[i] + numbers[j] == target){
        //         return new int[]{i+1, j+1};
        //     }
        //     if(numbers[i] + numbers[j] < target){
        //         i++;
        //     }
        //     else{
        //      j--;
                
        //     }
        // }
        // return new int[0];

        for(int i =0; i< n ; i++){
            int find = target - numbers[i];
            int l = i+1;
            int h = n-1;

            while(l<=h){
                int mid = l + (h-l)/2;
                if(numbers[mid] == find){
                    return new int []{i+1, mid+1};
                }
                if(numbers[mid] > find){
                    h =mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return new int[0];
    }
}