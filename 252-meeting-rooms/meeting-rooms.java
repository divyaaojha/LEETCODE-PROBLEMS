class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        //The key idea is checking if any meetings overlap.
        // If two meetings overlap, the person cannot attend both → return false.
        // If no overlaps exist, return true.

       Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
       for(int i =1; i< intervals.length; i++){
        //if overlap - return false;
        if(intervals[i-1][1] > intervals[i][0]){
            return false;
        }
       } 

       return true;
    }
}