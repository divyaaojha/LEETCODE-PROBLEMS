class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hindex =0;
        int n = citations.length;
        for(int i =0; i < n; i++){
           int paperwithatleastthiscite= n-i;
           //since it is sorted in asc, so to its right all papers with equal or more citataions are mentioned
            //i.e. n-i no of papers have greater than or equal to cites
            

            int currentcitationatleastHvalue = citations[i];
            if(currentcitationatleastHvalue  >= paperwithatleastthiscite){
                hindex = paperwithatleastthiscite;
                //got answer

                break;
            }



        }
          
        return hindex;
    }
}