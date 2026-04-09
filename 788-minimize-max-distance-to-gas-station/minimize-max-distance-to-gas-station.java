class Solution {
    public double minmaxGasDist(int[] stations, int k) {
        int n = stations.length;

        double low=0.0;
        double high=0.0;

        for(int i =1; i<n ; i++){
            //finding the maxiumum gap- that will be the high of the range
            high = Math.max(high, stations[i]-stations[i-1]);
        }

        //Answers within 10-6 of the actual answer will be accepted.- precision
        while( high-low > 1e-6){
            double mid = (low+high)/2.0;

            int requiredtstation=0;
            for(int i =1; i<n; i++){
                double gap = stations[i]-stations[i-1]; // current gap
                requiredtstation += (int) (gap/mid);// stations needed tp fill the gap
            }

            // all stations needed to fill gap at with max dist mid are calculated, niow checking their validity
            if(requiredtstation <=  k){
                // we can further decrease the max dist;
                high = mid;
            }
            else{
                low = mid;
            }
            // we didnt do mid +2, or mid-1, ad answer will be in double, - continuous value not integer
             
        }

        return high;
             //first valid distance
    }
}