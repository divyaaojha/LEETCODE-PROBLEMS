class Solution {
    public int maxProfit(int[] prices) {
        
        // int n =prices.length;
        // int maxi=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1; j<n;j++){
        //         int diff = prices[j]-prices[i];
        //         if(diff>maxi){
        //             maxi=diff;
        //         }
        //     }
        // }

        // return maxi;
        //TLE- 


        //no need for 2 loops, you only have to subtract the min value from, current values to find if this is the new max profit

        int min_price= Integer.MAX_VALUE;
        int max_profit=0;

        for(int price: prices){
            //first check if new lowest price there
            if(price < min_price){
                min_price= price;
            }
            int probable_profit = price - min_price;

            max_profit = Math.max(max_profit, probable_profit);

        }
return max_profit;

    }
}