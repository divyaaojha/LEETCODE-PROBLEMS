class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        double maxavg=Double.NEGATIVE_INFINITY;;
         double sum=0.0;

    for(int i =0;i<k; i++ ){
        sum += nums[i];
    }
    maxavg =Math.max(maxavg,(double) sum/k);

    for(int i =k; i<n; i++){
        sum -= nums[i-k];
        sum+= nums[i];
        maxavg =Math.max(maxavg,(double) sum/k);
    }
    return maxavg;
        
        /*
        1 12 -5 -6 50 3    k =4
        if nums.length == k return (double)sum of elelments/k 
        else 


        */
    }
}



/*   TLE, O (NK) solution
        int n = nums.length;
        double maxavg=Double.NEGATIVE_INFINITY;;

    for(int i =0;i<=n-k; i++ ){
        int j =0;
        double sum=0.0;
        while(j<k){
            sum += nums[j+i];
            j++;
        }
        maxavg =Math.max(maxavg,(double) sum/k);

    }
    return maxavg;
*/