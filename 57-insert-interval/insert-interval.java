class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i=0;
       List<int[]> ans= new ArrayList<>();

        //// 1. add intervals before overlap
        while( i<n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        //// 2. overlapping
        while( i<n && intervals[i][0] <= newInterval[1] ){
            newInterval[0]= Math.min( newInterval[0], intervals[i][0]);
            newInterval[1]= Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        ans.add(newInterval);

        //// 3. add remaining intervals
        while(i < n){
            ans.add(intervals[i]);
            i++;
        }

      



return ans.toArray(new int[ans.size()][]);















    //     //nlogn solution, with n extra space.
    //     //passed the testcases, and submitted, but find a solution which utilises that the array is already sorted
    //     List<int[]> temp= new ArrayList<>();
      
    //    ans.add(newInterval);
    //    for(int[] interval: intervals){
    //     ans.add(interval);
    //    }
    //    ans.sort((a,b) -> a[0] - b[0]);

    //    for(int[] an: ans){
    //     if(temp.isEmpty() || temp.get(temp.size()-1)[1] < an[0]){
    //         temp.add(an);
    //     }
    //     else{
    //         temp.get(temp.size()-1)[1] = Math.max(temp.get(temp.size()-1)[1],  an[1]);
    //     }
    //    }
    //     return temp.toArray(new int[temp.size()][]);
    }
}