class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxweight = weights[0];
        int sumweight = 0;

        for(int w : weights){
            sumweight += w ;
            maxweight = Math.max(maxweight, w);
            
        }

        int l = maxweight; int r = sumweight;

        while(l<=r){
            int mid = l + (r-l)/2;

            int daycount=1;
            int capweight=0;
            for(int w : weights){
                if((capweight + w) <= mid){
                    capweight+=w;
                }
                else{
                    capweight=w;
                    daycount++;
                }
            }

            if(daycount <= days){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }


        return l;
    }
}