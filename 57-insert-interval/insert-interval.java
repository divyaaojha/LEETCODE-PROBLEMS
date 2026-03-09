class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        List<int[]> temp= new ArrayList<>();
      
       ans.add(newInterval);
       for(int[] interval: intervals){
        ans.add(interval);
       }
       ans.sort((a,b) -> a[0] - b[0]);

       for(int[] an: ans){
        if(temp.isEmpty() || temp.get(temp.size()-1)[1] < an[0]){
            temp.add(an);
        }
        else{
            temp.get(temp.size()-1)[1] = Math.max(temp.get(temp.size()-1)[1],  an[1]);
        }
       }
        return temp.toArray(new int[temp.size()][]);
    }
}