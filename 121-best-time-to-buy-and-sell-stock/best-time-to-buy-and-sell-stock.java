class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i =0; int j =1;
        int maxProfit=0;

        while( j<n ){
            if((prices[j]< prices[i]) ){
                 i =j;
            }
            else{
                 maxProfit=Math.max(maxProfit,prices[j]-prices[i]) ;
            }

            j++;
        }
        return maxProfit;
    }
}