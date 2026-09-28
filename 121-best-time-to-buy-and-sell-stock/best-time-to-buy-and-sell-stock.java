class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProf =0;
        int l =0; int r = 1;
        while( r <prices.length){
           int currprof = prices[r] - prices[l] ;
           if(maxProf< currprof) maxProf=currprof ;
           if(prices[r] < prices[l] ) l=r;

           r++;


        }
        return maxProf;
    }
}