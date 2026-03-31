class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if( n < (long)m*k){
            return -1;
        }

       
        int max= bloomDay[0];
        int min= bloomDay[0];
        for(int i : bloomDay){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        int l = min; int r =max;
        while( l<=r ){
            int mid = l + (r-l)/2;

            int countk=0;
            int bounum=0;

            for(int i =0; i<n; i++){
                if(bloomDay[i] <= mid){
                    countk++;
                    if(countk == k){
                        bounum++;
                        countk=0;
                    }
                }
                else{
                    countk=0;
                
                }
            }
            if(bounum >=m){
                r = mid-1;
            }
            else{
               l = mid+1; 
            }
        }

        return l;

    }
}