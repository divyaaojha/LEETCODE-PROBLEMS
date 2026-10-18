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

        int i =0; int j =n-1;

        while(i<j && j<n){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }
            if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
             j--;
                
            }
        }
        return new int[0];
    }
}