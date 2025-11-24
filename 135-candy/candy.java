class Solution {
    public int candy(int[] ratings) {
        // basically intuition is a two-pass algorithm
        int n = ratings.length;
        int arr[] =new int[n]; 

        Arrays.fill(arr, 1); // each studnet must get atleast 1 chocolate

        int candies=0;
        //first pass left to right, incresing candy only when its rating is higher than left neighbour
        for(int i =1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                arr[i]= arr[i-1] +1;


            } 
        }

        //Second pass right to left, incresing candy only when its rating is higher than right neighbour
        for(int i =n-2 ; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i], arr[i+1] + 1);

            }
        }

        for(int i =0; i<n; i++){
            candies+= arr[i];
        }
        return candies;

    }
}