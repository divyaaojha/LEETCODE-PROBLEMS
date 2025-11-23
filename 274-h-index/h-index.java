class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int hindex=0;

        for(int i =0; i<n; i++){
            if(citations[i] >= (n-i)){
                int temp = n-i;
                hindex =Math.max(hindex, temp);
            }
        }
        return hindex;
    }
}