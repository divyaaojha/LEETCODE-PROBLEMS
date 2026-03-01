class Solution {
    public int maxProfit(int[] prices) {
int minprice=Integer.MAX_VALUE;
int maxProfit= 0;

for(int i=0;i<prices.length; i++){
    minprice= Math.min(minprice, prices[i]);
    maxProfit= Math.max(maxProfit, prices[i]-minprice);

}

return maxProfit;

// logic is broken, ***********************************

// Wrong Answer
// 141 / 212 testcases passed

// Editorial
// Input
// prices =
// [2,4,1]

// Use Testcase
// Output
// 3
// Expected
// 2


//  int minprice=prices[0];
//  int maxprice =0;
// int indmin=0;
//  for(int i =1;i<prices.length; i++){
//     if(prices[i]<minprice){
//         minprice= prices[i];
//         indmin=i;
//     }
//     else if(indmin <i  && maxprice<prices[i] ){
//         maxprice=prices[i];
//     }
//  }
// if(maxprice>minprice){
//     return maxprice-minprice;
// }


// return 0;

//////////////////////////////////////////////////////////////////////////////////////////


        // int n = prices.length;
        // int minprice=Integer.MAX_VALUE;
        // int maxProfit=0;
        // for(int i =0; i<n; i++){

        
        //     minprice= Math.min(minprice, prices[i]);
        //     maxProfit= Math.max(maxProfit, prices[i] - minprice);

        // }

        // return maxProfit;
    }
}