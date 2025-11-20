class Solution {
    public int maxProfit(int[] prices) {
    //    int minPrice = Integer.MAX_VALUE;
    //    int maxProfit= 0;
    //    int ans=0;
    //    for(int i =0; i <prices.length; i++){
    //     if(prices[i]<minPrice){
    //         //buying stock
    //         minPrice = prices[i];
    //     }
    //     int probableProfit= prices[i]-minPrice;
    //     if(probableProfit > maxProfit){
    //         maxProfit= probableProfit;
    //         ans+=maxProfit;
    //         minPrice= prices[i++];
    //     }
    //    } 
    //    return ans;
   
    int maxProfit= 0; 
    for(int i =1; i <prices.length ;  i++){
       
        if(prices[i] > prices[i-1]){
            maxProfit += prices[i] - prices[i-1];
        }
    }
    return maxProfit;
}}